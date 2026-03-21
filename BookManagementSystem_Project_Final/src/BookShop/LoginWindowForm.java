package BookShop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.*;
import java.util.Scanner;

public class LoginWindowForm{
    private JPanel loginwinform;
    private JLabel headpanel;
    private JLabel lbl_userid;
    private JLabel lbl_password;
    private JTextField txt_userid;
    private JPasswordField txt_password;
    private JButton loginButton;
    private JFrame jframe;

    LoginWindowForm() throws IOException {
        jframe = new JFrame("BookManagementSystem");
        jframe.setContentPane(loginwinform);
        ImageIcon logo = new ImageIcon("src/Image/bookicon.jpg");
        jframe.setIconImage(logo.getImage());
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jframe.setSize(320,200);
        jframe.setLocationRelativeTo(null);

        jframe.setVisible(true);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userId = txt_userid.getText();
                String password = new String(txt_password.getPassword());
                if (userId.isEmpty() && password.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please fill in your UserID and Password","Warning",JOptionPane.WARNING_MESSAGE);
                    txt_userid.setText("");
                    txt_password.setText("");
                    txt_userid.requestFocusInWindow();
                    return;
                }
                else if (password.isEmpty()) {
                    JOptionPane.showMessageDialog(null,"Please fill in your Password","Warning",JOptionPane.WARNING_MESSAGE);
                    txt_password.setText("");
                    txt_password.requestFocusInWindow();
                    return;
                }
                else if (userId.isEmpty()) {
                    JOptionPane.showMessageDialog(null,"Please fill in your UserID","Warning",JOptionPane.WARNING_MESSAGE);
                    txt_userid.setText("");
                    txt_userid.requestFocusInWindow();
                    return;
                }
                try {
                    Scanner sc = new Scanner(new File("src/Files/administrator.txt"));
                    boolean loginSuccess = false;
                    while (sc.hasNextLine()) {
                        String line = sc.nextLine();
                        String[] admininfo = line.split(",");

                        if (admininfo.length == 2) {
                            if (admininfo[0].trim().equals(userId) && admininfo[1].trim().equals(password)) {
                                loginSuccess = true;
                                break;
                            }
                        }
                    }
                    sc.close();
                    if (loginSuccess){
                        new BookManagementSystemForm();
                        jframe.dispose();
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Invalid UserID or Password", "Login Failed", JOptionPane.ERROR_MESSAGE);
                        txt_userid.requestFocusInWindow();
                    }
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "Database file not found!", "System Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
    public static void main(String[] args) throws IOException {
        new LoginWindowForm();
    }
}
