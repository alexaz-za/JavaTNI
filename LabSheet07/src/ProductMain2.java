import java.util.Scanner;

public class ProductMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product product1 = new Product();
        product1.name = "Pens";
        product1.price = 10.5;
        product1.quantity = 50;

        Product product2 = new Product();
        product2.name = "NoteBooks";
        product2.price = 25.75;
        product2.quantity = 20;

        System.out.println("Welcome to Mini Shop" +
                "\n--------------------------------" +
                "\nPress [1] to buy Pen" +
                "\nPress [2] to buy Notebook");

        System.out.print("Enter a number: ");
        int option = sc.nextInt();
        while (option > 2 || option < 1){
            System.out.print("Invalid number! Enter a number, again: ");
            option = sc.nextInt();
        }
        System.out.println();
        if (option == 1){
            product1.showInfo();
            System.out.print("How many Pens do you want to buy? ");
            product1.sell(sc.nextInt());
            product1.showInfo();
        }
        else if (option == 2){
            product2.showInfo();
            System.out.print("How many Notebooks do you want to buy? ");
            product2.sell(sc.nextInt());
            product2.showInfo();
        }

    }
}
