import java.util.Scanner;

public class Lab405 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input some sentence: ");
        String input = scan.nextLine();

        while (!input.endsWith(".")){
            System.out.print("The sentence must end with full stop point: ");
            input = scan.nextLine();
        }
        System.out.println();
        System.out.println(input.replace(" ","\n"));
    }
}
