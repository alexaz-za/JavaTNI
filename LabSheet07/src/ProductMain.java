import javax.swing.*;
import java.sql.SQLOutput;

public class ProductMain {
    public static void main(String[] args) {
        Product product = new Product();
        JOptionPane.showMessageDialog(null,"Welcome to Product Stock System");
        product.name = JOptionPane.showInputDialog("Enter product name:");
        product.price = Double.parseDouble(JOptionPane.showInputDialog("Enter product price per item:"));
        product.quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter product stock:"));

        product.showInfo();

        int add_more = JOptionPane.showConfirmDialog(null,"Do you want to add more item?","Select an Option",JOptionPane.YES_NO_CANCEL_OPTION);
        if (add_more == JOptionPane.YES_OPTION) {
            int stock = Integer.parseInt(JOptionPane.showInputDialog("How many items to add in stock?"));
            System.out.println("\nAdded " + stock + " items to stock");
            product.quantity += stock;
        }
        int change_price = JOptionPane.showConfirmDialog(null,"Do you want to change price?","Select an Option",JOptionPane.YES_NO_CANCEL_OPTION);
        if (change_price == JOptionPane.YES_OPTION) {
            product.price = Double.parseDouble(JOptionPane.showInputDialog("How much is the new price per item?"));
            System.out.println("Change price to " + product.price + " baht");
        }
        System.out.println();
        product.showInfo();
    }
}
