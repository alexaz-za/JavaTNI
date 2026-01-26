import java.util.Scanner;

public class ProductMain4 {
    static Scanner sc = new Scanner(System.in);

    static void setting_product(Product... products){
        String[] names = {"Pens", "Pencils", "Markers", "Highlighters"};
        double[] prices = {25.5,17.25,30,35};
        int[] quantities = {20,35,10,40};

        for (int i = 0;i<products.length;i++){
            products[i] = new Product();
            products[i].name = names[i];
            products[i].price = prices[i];
            products[i].quantity = quantities[i];
        }
    }
    public static void main(String[] args) {
        Product[] products = new Product[4];
        setting_product(products);

        System.out.println("Welcome to MINI SHOP!!" +
                "\n--------------------------------------------" +
                "\nPress 1 to buy Pens (items=20)" +
                "\nPress 2 to buy Pencils (items=35)" +
                "\nPress 3 to buy Markers (items=10)" +
                "\nPress 4 to buy Highlighters (items=40)" +
                "\n--------------------------------------------");
        System.out.print("Enter a number: ");
        int option = sc.nextInt();
        while (option > 4 || option < 1){
            System.out.print("Invalid!! Enter a number: ");
            option = sc.nextInt();
        }
        System.out.println("--------------------------------------------");
        for (int i = 0;i<products.length;i++){
            if(i == option-1){
                System.out.print("How many " + products[i].name + " do you want to buy? ");
                products[i].sell(sc.nextInt());
                System.out.println();
                products[i].showInfo();
            }
        }
    }
}
