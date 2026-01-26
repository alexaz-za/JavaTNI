import javax.swing.*;
import java.text.DecimalFormat;

public class Ex203 {
    public static void main(String[] args) {
        final int lecture_price = 1900,lab_price = 3500;
        DecimalFormat frm = new DecimalFormat("#,###.00");
        int lecture_credit = Integer.parseInt(JOptionPane.showInputDialog("Enter lecture credit: "));
        int lecture_total_price = lecture_price * lecture_credit;
        int lab_credit = Integer.parseInt(JOptionPane.showInputDialog("Enter lab credit: "));
        int lab_total_price = lab_price * lab_credit;
        int total_price = lecture_total_price + lab_total_price;
        JOptionPane.showMessageDialog(null,
                "Lecture: " + lecture_credit + "x" + lecture_price + "=" + frm.format(lecture_total_price) +
                "\nLaboratory: " + lab_credit + "x" + lab_price + "=" + frm.format(lab_total_price) +
                "\nTotal price: " + frm.format(total_price));
    }
}
