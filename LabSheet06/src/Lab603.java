import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Lab603 {
    static Scanner sc = new Scanner(System.in);
    static int[] random_array(){
        Random random = new Random(); //ต้อง import java.util.Random; ถ้าไม่ได้ใช้คำสั่ง import java.util.*;

        int[] numbers = new int[10];

        for (int i=0; i<numbers.length; i++) {
            numbers[i] = random.nextInt(100); //สุ่มตัวเลข 0-99 เก็บไว้ใน number[i]
        }
        return numbers;
    }
    static void display_array(int[] numbers){
        for (int num : numbers){
            System.out.print(num + " ");
        }
    }
    static int count_element(int[] numbers,int element){
        int count = 0;
        for (int num : numbers)
            if (element == num)
                count++;
        return count;
    }
    public static void main(String[] args) {
        int[] numbers = random_array();
        System.out.print("Enter your guess (0-20): ");
        int guess_number = sc.nextInt();
            if (count_element(numbers,guess_number) == 1){
                System.out.println("\nCongratulations!! " + guess_number + " is an element in the array!!");
            }
            else if (count_element(numbers,guess_number) > 1) {
                System.out.println("\nCongratulations!! " + guess_number + " is an element in the array!!" +
                        "\nFantastic!! It also appears more than once!!");
            }
            else {
                System.out.print("\nSorry, try again next time..." +
                        "\nHere are the elements in the array: ");
                display_array(numbers);
            }
        }
    }
