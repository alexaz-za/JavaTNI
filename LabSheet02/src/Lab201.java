import java.text.DecimalFormat;

public class Lab201 {
    public static void main(String[] args) {
        double num1 = 10,num2 = 8;
        DecimalFormat frm = new DecimalFormat("0");
        System.out.println("\nSummation = " + frm.format(num1 + num2) +
                "\nSubtraction = " + frm.format(num1-num2) +
                "\nMultiplication = " + frm.format(num1*num2) +
                "\nDivision = " + (num1/num2) +
                "\nModulus = " + frm.format(num1%num2));
    }
}
