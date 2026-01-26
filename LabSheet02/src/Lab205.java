import javax.swing.*;

public class Lab205 {
    public static void main(String[] args) {
        int input_min = Integer.parseInt(JOptionPane.showInputDialog("Input minutes:"));
        JOptionPane.showMessageDialog(null,input_min + " minutes is " + (input_min/60) + " hour " + (input_min%60) + " minute");
    }
}
