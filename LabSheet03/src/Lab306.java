import javax.swing.*;

public class Lab306 {
    public static void main(String[] args) {
        int input = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer number: "));
        int sum = 0;
        for(int i = 1;i<=input;i++){
            sum += i;
        }
        JOptionPane.showMessageDialog(null,"Summation of 1 to " + input + " is " +sum);
    }
}
