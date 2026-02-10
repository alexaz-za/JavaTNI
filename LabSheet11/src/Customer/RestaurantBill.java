package Customer;

import javax.swing.*;

public class RestaurantBill {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter customer's name:");
        double total_price = Double.parseDouble(JOptionPane.showInputDialog("Enter customer's bill"));
        int is_member = JOptionPane.showConfirmDialog(null,"Do you have a member card?","Member",JOptionPane.YES_NO_OPTION);

        if (is_member == JOptionPane.YES_OPTION){
            String member_level = JOptionPane.showInputDialog("Enter a member level [Gold / Premium]:");
            Member bill = new Member(name,total_price,member_level);
            JOptionPane.showMessageDialog(null,bill);
        } else {
            Regular bill = new Regular(name,total_price);
            JOptionPane.showMessageDialog(null,bill);
        }
    }
}