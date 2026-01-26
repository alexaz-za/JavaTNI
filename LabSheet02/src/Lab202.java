import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        double number1 = scan.nextInt();
        System.out.print("Enter number 2: ");
        double number2 = scan.nextInt();
        DecimalFormat frm = new DecimalFormat("0");

        System.out.println("\nSummation = " + frm.format(number1 + number2) +
                "\nSubtraction = " + frm.format(number1-number2) +
                "\nMultiplication = " + frm.format(number1*number2) +
                "\nDivision = " + (number1/number2) +
                "\nModulus = " + frm.format(number1%number2));
    }
}
