import java.util.Scanner;

public class Ex604 {

    public static Scanner sc = new Scanner(System.in);

    public static int input_length(){
        System.out.print("How many number to input: ");
        int number = sc.nextInt();
        while (number <= 1){
            System.out.print("How many number to input: ");
            number = sc.nextInt();
        }
        return number;
    }
    public static int[] input_array(int length){
        int[] numbers = new int[length];
        for(int i = 0;i<numbers.length;i++){
            System.out.print("Enter number: ");
            numbers[i] = sc.nextInt();
        }
        return numbers;
    }
    public static int count_even(int... numbers){
        int count = 0;
        for (int num : numbers){
            if(num%2==0)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
//        int length = input_length();
//        int[] numbers = input_array(length);
        int[] numbers = input_array(input_length());
        for (int num : numbers){
            System.out.println(num);
        }
    }
}
