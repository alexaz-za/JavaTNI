import javax.swing.*;
import java.util.Scanner;

public class Lab404 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String all_word = "";
        while (true){
            System.out.print("Enter word: ");
            String word = scan.nextLine();
            if (word.equalsIgnoreCase("Stop"))
                break;
            all_word += word + " ";
        }
        System.out.print(all_word);
    }
}
