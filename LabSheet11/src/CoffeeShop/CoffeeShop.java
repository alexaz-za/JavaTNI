package CoffeeShop;

import java.util.Scanner;

public class CoffeeShop {
    static Scanner sc = new Scanner(System.in);

    static Espresso orderEspresso(){
        System.out.print("Enter a size: ");
        String size = sc.next();
        Espresso espresso = new Espresso(size);
        System.out.print("Press 'y' or 'Y' for adding a shot: ");
        String addShot = sc.next();

        if(addShot.equalsIgnoreCase("y")){
            System.out.print("How many shots for adding in Espresso: ");
            int shot = sc.nextInt();
            espresso.addShot(shot);
        }

        return espresso;
    }

    static Frappuccino orderFrappuccino(){
        System.out.print("Enter a size: ");
        String size = sc.next();
        System.out.print("Do you would like to add whipped cream [y/Y]? ");
        String addWhipped = sc.next();

        boolean hasWhipped = false;
        if(addWhipped.equalsIgnoreCase("y")){
            hasWhipped = true;
        }

        Frappuccino frappuccino = new Frappuccino(size,hasWhipped);
        return frappuccino;
    }

    public static void main(String[] args) {
        int EspressoCount = 0;
        int Frappuccino = 0;
        double totalPrice = 0;

        while (true){
            System.out.println("Press 1 for ordering Espresso\nPress 2 for ordering Frappuccino");
            System.out.print("Enter an option: ");
            int option = sc.nextInt();

            Drink drink = null;

            if (option == 1) {
                drink = orderEspresso();
                totalPrice += drink.calculateFinalPrice();
                System.out.println(drink);
                EspressoCount++;
            }
            else if (option == 2) {
                drink = orderFrappuccino();
                totalPrice += drink.calculateFinalPrice();
                System.out.println(drink);
                Frappuccino++;
            }
            else break;

            System.out.print("\nDo you want to order more [y/Y]? ");
            String order_more = sc.next();

            if (!order_more.equalsIgnoreCase("y")) break;
        }
        System.out.println("\nYou ordered " + EspressoCount + " Espresso" +
                "\nYou ordered " + Frappuccino + " Frappuccino" +
                "\nTotal Price = " + totalPrice);

    }
}
