package BookShop;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.regex.Pattern;

public class BookManagementSystemForm {
    private JPanel bookform;
    private JTable stocklist;
    private JButton btn_search;
    private JButton btn_addstock;
    private JButton btn_addcart;
    private JButton btn_viewcart;
    private JButton btn_logout;
    private JScrollPane scrollbar;
    private JButton btn_clearsearch;
    private JFrame jframe;

    private DefaultTableModel model;
    private Stock stock;
    private CartManager cartManager;

    BookManagementSystemForm() {
        jframe = new JFrame("BookManagementSystem");
        jframe.setContentPane(bookform);
        ImageIcon logo = new ImageIcon("src/Image/bookicon.jpg");
        final Taskbar taskbar = Taskbar.getTaskbar();
        taskbar.setIconImage(logo.getImage()); //macos app icon
        jframe.setIconImage(logo.getImage()); //windows panel icon
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jframe.setSize(800, 500);
        jframe.setLocationRelativeTo(null);

        stock = new Stock("src/Files/books.txt");
        try {
            stock.loadFromFile();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(jframe, "File not found.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        cartManager = new CartManager(stock);

        String[] columns = {"Title", "Author", "Price", "Quantity"};
        model = new DefaultTableModel(columns, 0) {
            @Override
            public boolean isCellEditable(int row, int column) { return false; }
        };
        stocklist.setModel(model);
        refreshMainTable();

        DefaultTableCellRenderer header = (DefaultTableCellRenderer) stocklist.getTableHeader().getDefaultRenderer();
        header.setHorizontalAlignment(JLabel.CENTER);
        TableColumnModel columnModel = stocklist.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(200);
        columnModel.getColumn(1).setPreferredWidth(100);
        columnModel.getColumn(2).setPreferredWidth(60);
        columnModel.getColumn(3).setPreferredWidth(50);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        stocklist.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        stocklist.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        stocklist.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        stocklist.getTableHeader().setReorderingAllowed(false);
        for (int i = 0; i < stocklist.getColumnCount(); i++)
            stocklist.getColumnModel().getColumn(i).setResizable(false);

        jframe.setVisible(true);

        btn_search.addActionListener(e -> {
            String query = JOptionPane.showInputDialog(jframe, "Enter Book Title or Author:");
            if (query == null || query.trim().isEmpty()) return;

            TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
            stocklist.setRowSorter(sorter);
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + Pattern.quote(query), 0, 1));
        });

        btn_clearsearch.addActionListener(e -> {
            TableRowSorter<DefaultTableModel> sorter = (TableRowSorter<DefaultTableModel>) stocklist.getRowSorter();
            if (sorter != null) sorter.setRowFilter(null);
        });

        btn_addstock.addActionListener(e -> {
            int selectedRow = stocklist.getSelectedRow();
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(jframe, "Select a book to restock.");
                return;
            }

            int modelRow = stocklist.convertRowIndexToModel(selectedRow);
            String title = (String) model.getValueAt(modelRow, 0);

            String input = JOptionPane.showInputDialog(jframe, "Enter quantity to add:");
            if (input == null) return;

            try {
                int addQty = Integer.parseInt(input);
                if (addQty >= 0) {
                    stock.addStock(title, addQty);
                    try {
                        stock.saveToFile();
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(jframe, "Error saving file.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    refreshMainTable();
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(jframe, "Invalid number entered.");
            }
        });

        btn_addcart.addActionListener(e -> {
            int selectedRow = stocklist.getSelectedRow();
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(jframe, "Please select a book first!");
                return;
            }

            int modelRow = stocklist.convertRowIndexToModel(selectedRow);
            String title = (String) model.getValueAt(modelRow, 0);

            boolean success = cartManager.addToCart(title);
            if (success) {
                refreshMainTable();
                JOptionPane.showMessageDialog(jframe, title + " added to cart!");
            } else {
                JOptionPane.showMessageDialog(jframe, "Out of stock!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        btn_viewcart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Cart(cartManager, new Runnable() {
                    @Override
                    public void run() {
                        refreshMainTable();
                    }
                });
            }
        });

        btn_logout.addActionListener(e -> {
            jframe.dispose();
             try {
                 new LoginWindowForm();
             } catch (Exception er) {
                 er.getMessage();
             }
        });
    }

    public void refreshMainTable() {
        model.setRowCount(0);
        for (Book book : stock.getBooks()) {
            model.addRow(new Object[]{
                    book.getTitle(),
                    book.getAuthor(),
                    book.getPrice(),
                    book.getQuantity()
            });
        }
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        new BookManagementSystemForm();
    }
}