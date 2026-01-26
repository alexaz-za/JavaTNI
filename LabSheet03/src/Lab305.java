import java.util.Scanner;

public class Lab305 {
    public static void main(String[] args) {
        Scanner srn = new Scanner(System.in);
        System.out.print("Enter the first  number: ");
        int first_number = srn.nextInt();
        System.out.print("Enter the second number: ");
        int second_number = srn.nextInt();

        for(int i = first_number;i <= second_number;i++){
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
