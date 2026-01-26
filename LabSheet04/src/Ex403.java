import javax.swing.*;

public class    Ex403 {
    public static void main(String[] args) {
        String email = JOptionPane.showInputDialog("Enter your Gmail: ");

        while (!email.toLowerCase().endsWith("@gmail.com")){
            email = JOptionPane.showInputDialog("Please enter your Gmail: ");
        }
        JOptionPane.showMessageDialog(null,"Your mail is " + email);
    }
}
