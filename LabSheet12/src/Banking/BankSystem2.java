package Banking;

import java.util.Scanner;

public class BankSystem2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter your bank account: ");
        String accountId = sc.nextLine();

        AccountTransaction account = new AccountTransaction(accountId);

        if (account.hasAccount()) {
            boolean is_loop = true;

            System.out.println("\nPress 1 to deposit" +
                    "\nPress 2 to withdraw" +
                    "\nPress 3 to check balance" +
                    "\nPress 4 to exit");

            while (is_loop){
                System.out.print("\nEnter a menu: ");
                int choice = sc.nextInt();
                switch (choice){
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        account.deposit(sc.nextDouble());
                        System.out.println("Your balance = " + account.checkBalance());
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        account.withdraw(sc.nextDouble());
                        System.out.println("Your balance = " + account.checkBalance());
                        break;
                    case 3:
                        System.out.println("Your balance = " + account.checkBalance());
                        break;
                    case 4:
                        is_loop = false;
                        break;
                }
            }
        }
        else System.out.println("\nBank account not found...");
    }
}
