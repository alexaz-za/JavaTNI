import java.util.Scanner;

public class Ex303 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = scan.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = scan.nextInt();
        System.out.print("Enter number 3: ");
        int num3 = scan.nextInt();

        /*String result = (num1 == num2 && num2 == num3) ? "\nAll numbers are the same." : "\nAll number are NOT the same.";
        System.out.println(result);*/

       System.out.println(num1 == num2 && num2 == num3 ? "\nAll numbers are the same." : "\nAll number are NOT the same.");
       System.out.println("All number are " + (num1 == num2 && num2 == num3 ? "All number are the same" : "All number are NOT the same"));
    }
}
