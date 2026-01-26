import javax.swing.*;

public class Lab307 {
    public static void main(String[] args) {
        double sum = 0,price;
        while (true){
            price = Double.parseDouble(JOptionPane.showInputDialog("Input price [press 0 to stop]:"));
            if (price == 0) break;
            if (price > 0) {
                sum += price;
            }
            else {
                JOptionPane.showInputDialog("Invalid price!!"
                        + "\nInput price [press 0 to stop]:");
            }
        }
        JOptionPane.showMessageDialog(null,"Total price is " + sum + " baht.");
    }
}
