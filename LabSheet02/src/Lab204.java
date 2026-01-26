import java.util.Scanner;

public class Lab204 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input hour  : ");
        int input_hour = scan.nextInt();
        System.out.print("Input minute: ");
        int input_min = scan.nextInt();

        System.out.println("Total time is " + (input_hour*60+input_min) +" minutes");
    }
}
