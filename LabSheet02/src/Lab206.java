import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab206 {
    public static void main(String[] args) {
        final double buffet = 299.00;
        DecimalFormat frm = new DecimalFormat("#,###.00");
        int customer = Integer.parseInt(JOptionPane.showInputDialog("How many customer?"));
        double vat = buffet * customer + (buffet*customer*7/100);
        double discount = Integer.parseInt(JOptionPane.showInputDialog(null,"Price with NET is "+ frm.format(vat) +" baht." +
                "\nHow much of discount (%) on your coupon?"));
        double total_price = vat-(vat*discount/100);
        int amount_paid = Integer.parseInt(JOptionPane.showInputDialog("Total price is "+ frm.format(total_price) + " baht." +
                "\nEnter the amount the customer paid:"));
        JOptionPane.showMessageDialog(null,"Total price is " + frm.format(total_price) + " baht." +
                "\nCustomer paid " + frm.format(amount_paid) + " baht." +
                "\nGet change " + frm.format(amount_paid-total_price) + " baht.");
    }
}
