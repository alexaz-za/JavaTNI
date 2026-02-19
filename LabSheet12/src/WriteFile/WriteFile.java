package WriteFile;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteFile {
    static String input_user(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = sc.next();
        System.out.print("Enter password: ");
        String password = sc.next();
        System.out.print("Enter gender  : ");
        String gender = sc.next();
        System.out.print("Enter birth year: ");
        int birthyear = sc.nextInt();

        return username + "," + password  + "," + gender  + "," + birthyear;
    }

    public static void main(String[] args) throws IOException {
        String data = input_user();

        FileWriter filename = new FileWriter("src/WriteFile/users2.txt",true);
        PrintWriter writer = new PrintWriter(filename);

        writer.println(data);

        writer.close();
    }
}
