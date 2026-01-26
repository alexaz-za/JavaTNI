import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstWindowForm {
    private JPanel winform;
    private JLabel lbl_firstname;
    private JLabel lbl_lastname;
    private JTextField txt_firstname;
    private JTextField txt_lastname;
    private JButton btn_Submit;
    private JButton btn_reset;
    private  JFrame jframe;

    FirstWindowForm(){
        jframe = new JFrame();
        jframe.setContentPane(winform);
        jframe.setTitle("My First Windows Form");
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jframe.setSize(300,200);
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);
        btn_Submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                if (txt_firstname.getText().isEmpty()){
//                    JOptionPane.showMessageDialog(null,"Please fill in your first name","Warning",JOptionPane.WARNING_MESSAGE);
//                }
                if (txt_firstname.getText().isEmpty() || txt_lastname.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please fill in your First Name or Last Name","Warning",JOptionPane.WARNING_MESSAGE);
                    txt_firstname.setText("");
                    txt_lastname.setText("");
                    txt_firstname.requestFocusInWindow();
                }
                else {
                    JOptionPane.showMessageDialog(null,txt_firstname.getText() + " " + txt_lastname.getText());
                    txt_firstname.setText("");
                    txt_lastname.setText("");
                    txt_firstname.requestFocusInWindow();
                }
            }
        });
        btn_reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt_firstname.setText("");
                txt_lastname.setText("");
                txt_firstname.requestFocusInWindow();
            }
        });
    }

    public static void main(String[] args) {
        FirstWindowForm windowForm = new FirstWindowForm();
    }
}
