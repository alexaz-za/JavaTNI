import java.util.Scanner;

public class Lab301 {
    public static void main(String[] args) {
        Scanner srn = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = srn.nextInt();

        if (number % 2 == 0 && number != 0){
            System.out.println("This number is Even and Positive number.");
        }
        else if (number % 2 != 0) {
            System.out.println("This number is Odd And Negative number.");
        }
        else if (number == 0) {
            System.out.println("This is Zero number.");
        }
    }
}
