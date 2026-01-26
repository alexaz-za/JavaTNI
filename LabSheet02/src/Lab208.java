import javax.swing.*;
import java.text.DecimalFormat;

public class Lab208 {
    public static void main(String[] args) {
        int input_start_hour = Integer.parseInt(JOptionPane.showInputDialog("Input start time (hour):"));
        int input_start_min = Integer.parseInt(JOptionPane.showInputDialog("Input start time (minute):"));
        int input_end_hour = Integer.parseInt(JOptionPane.showInputDialog("Input end time (hour):"));
        int input_end_min = Integer.parseInt(JOptionPane.showInputDialog("Input end time (minute):"));
        DecimalFormat frm = new DecimalFormat("00.##");
        int total_min = (input_end_hour*60+input_end_min) - (input_start_hour*60+input_start_min);
        int hour = total_min/60,min = total_min%60;
        double parkingFee = 50.0 + (total_min - 60) * 0.25;
        JOptionPane.showMessageDialog(null,"Start parking at "+input_start_hour+":"+frm.format(input_start_min)+
                "\nEnd parking at " + input_end_hour + ":" + frm.format(input_end_min) +
                "\nTotal time is "+ hour +" hour "+ min +" minutes"+
                "\nParking payment is " + frm.format(parkingFee) + " baht.");
    }
}
