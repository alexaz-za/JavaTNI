package BookShop;

import javax.swing.*;
import javax.swing.table.*;

public class Cart {
    private JPanel cartPanel;
    private JTable cartlist;
    private JButton checkoutButton;
    private JButton removeButton;
    private JButton closeButton;
    private JScrollPane scrollbar;
    private JFrame jframe;

    private DefaultTableModel cartModel;
    private CartManager cartManager;
    private Runnable onUpdateMainUI;

    Cart(CartManager cartManager, Runnable onUpdateMainUI) {
        this.cartManager = cartManager;
        this.onUpdateMainUI = onUpdateMainUI;

        jframe = new JFrame("Your Cart");
        jframe.setContentPane(cartPanel);
        ImageIcon logo = new ImageIcon("src/Image/bookicon.jpg");
        jframe.setIconImage(logo.getImage());
        jframe.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        jframe.setSize(600, 400);
        jframe.setLocationRelativeTo(null);

        String[] columns = {"Title", "Author", "Price"};
        cartModel = new DefaultTableModel(columns, 0) {
            @Override
            public boolean isCellEditable(int row, int column) { return false; }
        };
        cartlist.setModel(cartModel);

        DefaultTableCellRenderer header = (DefaultTableCellRenderer) cartlist.getTableHeader().getDefaultRenderer();
        header.setHorizontalAlignment(JLabel.CENTER);
        TableColumnModel columnModel = cartlist.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(200);
        columnModel.getColumn(1).setPreferredWidth(120);
        columnModel.getColumn(2).setPreferredWidth(80);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        cartlist.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        cartlist.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        cartlist.getTableHeader().setReorderingAllowed(false);
        for (int i = 0; i < cartlist.getColumnCount(); i++) {
            cartlist.getColumnModel().getColumn(i).setResizable(false);
        }

        refreshCartTable();
        jframe.setVisible(true);

        checkoutButton.addActionListener(e -> {
            if (cartManager.isEmpty()) {
                JOptionPane.showMessageDialog(jframe, "Your cart is empty!");
                return;
            }

            double total = cartManager.calculateTotal();
            int confirm = JOptionPane.showConfirmDialog(jframe,
                    String.format("Total: %.2f Baht\nConfirm Purchase?", total),
                    "Checkout", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                cartManager.checkout();
                refreshCartTable();
                onUpdateMainUI.run();
                JOptionPane.showMessageDialog(jframe, "Purchase Successful!");
                jframe.dispose();
            }
        });

        removeButton.addActionListener(e -> {
            int selectedRow = cartlist.getSelectedRow();
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(jframe, "Please select a book to remove.");
                return;
            }

            String titleToRemove = (String) cartlist.getValueAt(selectedRow, 0);

            if (cartManager.removeFromCart(titleToRemove)) {
                refreshCartTable();
                onUpdateMainUI.run();
                JOptionPane.showMessageDialog(jframe, "Removed: " + titleToRemove);
            }
        });

        closeButton.addActionListener(e -> jframe.dispose());
    }

    private void refreshCartTable() {
        cartModel.setRowCount(0);
        for (Book book : cartManager.getCartItems()) {
            cartModel.addRow(new Object[]{
                    book.getTitle(),
                    book.getAuthor(),
                    book.getPrice()
            });
        }
    }
}