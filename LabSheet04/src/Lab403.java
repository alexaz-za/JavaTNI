import javax.swing.*;

public class Lab403 {
    public static void main(String[] args) {
        final String pass = "Admin1234";

        String username = JOptionPane.showInputDialog(null,"Enter username:","Input",JOptionPane.QUESTION_MESSAGE);
        String password = JOptionPane.showInputDialog(null,"Enter Password:","Input",JOptionPane.QUESTION_MESSAGE);

        while (!username.equalsIgnoreCase("admin")||!password.equals(pass)){
            JOptionPane.showMessageDialog(null,"Login Fail...","Incorrect username or password",JOptionPane.WARNING_MESSAGE);
            username = JOptionPane.showInputDialog(null,"Enter username:","Input",JOptionPane.QUESTION_MESSAGE);
            password = JOptionPane.showInputDialog(null,"Enter Password:","Input",JOptionPane.QUESTION_MESSAGE);

        }
        JOptionPane.showMessageDialog(null,"Login Success!!");
    }
}
