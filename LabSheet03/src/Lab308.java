import java.util.Scanner;

public class Lab308 {
    public static void main(String[] args) {
        Scanner srn = new Scanner(System.in);
        System.out.print("How many number to input: ");
        int input = srn.nextInt();
        int max = 0,min = 0,even = 0,odd = 0;
        for(int i = 1;i <= input;i++){
            System.out.print("Enter number " + i + ": ");
            int number = srn.nextInt();
            if (number > max)
                max = number;
            if (number < min)
                min = number;
            if (number % 2 == 0)
                even++;
            if (number % 2 != 0)
                odd++;
        }
        System.out.println("\nMaximum = " + max);
        System.out.println("Minimum = " + min);
        System.out.println("Even number = " + even);
        System.out.println("Odd  number = " + odd);
    }
}
