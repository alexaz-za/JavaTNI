import java.util.Scanner;

public class    Ex402 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first  message: ");
        String first_message = scan.nextLine();
        System.out.print("Enter the second message: ");
        String sec_message = scan.nextLine();

        System.out.print("Sensitive comparison  : ");
        if (first_message.equals(sec_message)){
            System.out.println("Both messages are the same");
        }
        else {
            System.out.println("Both messages are NOT the same");
        }

        System.out.print("Insensitive comparison: ");
        if (first_message.equalsIgnoreCase(sec_message)){
            System.out.println("Both messages are the same");
        }
        else {
            System.out.println("Both messages are NOT the same");
        }
    }
}
