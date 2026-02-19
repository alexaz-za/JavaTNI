import javax.swing.*;

public class Exception102 {
    public static void main(String[] args) {
        int number = 0;
        boolean is_loop = true;

        while (is_loop){
            try {
                number = Integer.parseInt(JOptionPane.showInputDialog("Input an integer number: "));
                is_loop = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Error: " + e.getMessage(),"Error Message",JOptionPane.WARNING_MESSAGE);
            }
        }

        JOptionPane.showMessageDialog(null,"You inputted number = " + number);
    }
}
