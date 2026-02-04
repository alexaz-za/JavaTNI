import javax.swing.*;

public class CakeOrder3 {
    public static void main(String[] args) {
        double pound = Double.parseDouble(JOptionPane.showInputDialog("How many pounds do you want?"));
        String flavor = JOptionPane.showInputDialog("Enter a flavor birthday cake:");
        String message = JOptionPane.showInputDialog("Enter a message on cake:");

        BirthdayCake order = new BirthdayCake(message,pound,flavor,400);

        while (true){
            int option = JOptionPane.showConfirmDialog(null,order + "\n\nConfirm this order?","Select an Option",JOptionPane.YES_NO_CANCEL_OPTION);

            if (option == JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null,order);
                break;
            }
            else order.changeMessage(JOptionPane.showInputDialog("Enter a new message for changing:"));
        }
    }
}
