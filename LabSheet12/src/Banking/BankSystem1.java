package Banking;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BankSystem1 {
    static Scanner sc = new Scanner(System.in);
    static String input_account_id(){
        String account_id = "";
        boolean isValid = false;

        while (!isValid){
            System.out.print("Enter account id: ");
            account_id = sc.next();
            if (account_id.length() == 10) isValid = true;
        }
        return account_id;
    }
    static double input_initial_balance(){
        int input = 0;
        boolean is_loop = true;

        System.out.println();
        while (is_loop) {
            try {
                System.out.print("Enter your initial deposit amount: ");
                input = sc.nextInt();
                is_loop = false;
            } catch (InputMismatchException e) {
                sc.next();
                System.out.print("Try again!! ");
            }
        }
        return input;
    }

    public static void main(String[] args) throws IOException{
        String account_bank = input_account_id();
        double initial_balance = input_initial_balance();

        OpenNewAccount account = new OpenNewAccount(account_bank,initial_balance);
        String opened_account = account.recordAccount();

        System.out.println("\n"+ opened_account);
    }
}
