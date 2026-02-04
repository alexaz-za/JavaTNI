import java.util.Scanner;

public class CakeOrder2 {
    static Scanner sc = new Scanner(System.in);
    static String selectFlavor(){
        String[] flavors = {"Chocolate", "Vanilla", "Strawberry", "Lemon", "Red Velvet"};
        System.out.println("\nPress 1 for Chocolate\nPress 2 for Vanilla\nPress 3 for Strawberry\nPress 4 for Lemon\nPress 5 for Red Velvet");
        int input_flavor;
        while (true){
            System.out.print("Enter a flavor number: ");
             input_flavor = sc.nextInt();
             if (input_flavor >= 1 && input_flavor <= flavors.length){
                 return flavors[input_flavor-1];
             }
        }
    }

    public static void main(String[] args) {
        System.out.println("Press 1 to order Birthday Cake\nPress 2 to order Cup Cake\nPress 3 to order Brownie");
        System.out.print("Enter an option: ");
        int option = sc.nextInt();

        if (option == 1){
            String flavor = selectFlavor();
            System.out.print("\nEnter a message: ");
            sc.nextLine();
            String message = sc.nextLine();
            System.out.print("How many pounds: ");
            double pound = sc.nextDouble();

            BirthdayCake order = new BirthdayCake(message,pound,flavor,350);
            System.out.println("\n" + order);
        }
        else if (option == 2){
            String flavor = selectFlavor();
            System.out.print("\nHow many pieces: ");
            int piece = sc.nextInt();

            CupCake order = new CupCake(piece,flavor,70);
            System.out.println("\n" + order);
        }
        else if (option == 3){
            String flavor = selectFlavor();
            System.out.print("\nEnter a topping : ");
            String topings = sc.next();
            System.out.print("How many piece : ");
            int pieces = sc.nextInt();

            Brownie order = new Brownie(topings,pieces,flavor,35);
            System.out.println("\n" + order);
        }
        else {
            System.out.println("\nWrong option!! Try again!!");
        }
    }
}
