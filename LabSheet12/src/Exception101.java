import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception101 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int number = 0;
        boolean is_loop = true;

        while (is_loop) {
            try {
                System.out.print("Enter an integer number: ");
                number = sc.nextInt();
                is_loop = false;
            } catch (Exception e) {
                sc.next();
                System.out.println("Input wrong data type!! ");
            }
//            } catch (InputMismatchException e) {
//                sc.next();
//                System.out.println("Error: " + e.getMessage());
//                System.out.print("Input wrong data type!! ");
//            } catch (ArithmeticException e) {
//                sc.next();
//                System.out.println("Cannot calculate!! ");
//            }
        }
        System.out.println("\nYou inputted number = " + number);
    }
}
