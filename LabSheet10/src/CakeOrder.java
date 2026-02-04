import java.util.Scanner;

public class CakeOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // No.1
        System.out.println("Birthday Cake's Details: ");
        System.out.print("Enter a message on cake: ");
        String message = sc.nextLine();
        System.out.print("Enter a flavor : ");
        String flavor = sc.next();
        System.out.print("How many pounds: ");
        double pound = sc.nextDouble();

        // No.2
        BirthdayCake order1 = new BirthdayCake(message,pound,flavor,350);
        // No.3
        System.out.println(order1);

        System.out.println("\nCup Cake's Details:");
        System.out.print("Enter a flavor : ");
        flavor = sc.next();
        System.out.print("How many piece : ");
        int piece = sc.nextInt();

        CupCake order2 = new CupCake(piece,flavor,65);
        System.out.println(order2);

        System.out.println("Brownie Details:");
        System.out.print("Enter a flavor : ");
        String flavors = sc.next();
        System.out.print("Enter a topping : ");
        String topings = sc.next();
        System.out.print("How many piece : ");
        int pieces = sc.nextInt();

        Brownie order3 = new Brownie(topings,pieces,flavors,35);
        System.out.println(order3);

        System.out.println("Total price = " + (order1.calculateTotalPrice() + order2.calculateTotalPrice() + order3.calculateTotalPrice()));
    }
}
