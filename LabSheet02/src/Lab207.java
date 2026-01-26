import javax.swing.*;
import java.text.DecimalFormat;

public class Lab207 {
    public static void main(String[] args) {
        double wage = 7.50,tax = 0.15;
        DecimalFormat frm = new DecimalFormat("#,###.00");
        JOptionPane.showMessageDialog(null,"Welcome to the payroll application");
        String employee_name = JOptionPane.showInputDialog("Enter employee name:");
        int worked_hour = Integer.parseInt(JOptionPane.showInputDialog("Enter total hour for this employee:"));
        double total_earn = (worked_hour*wage);
        JOptionPane.showMessageDialog(null,"Employee name: " + employee_name +
                "\nHour worked: " + worked_hour +
                "\nHourly wage: $" + wage +
                "\nGross earning: $" + total_earn +
                "\nTax rate: " + tax +
                "\nTax: $" + (total_earn*tax) +
                "\nNet earnings: $" + (total_earn-(total_earn*tax)));
    }
}
