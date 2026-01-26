import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab203 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter product id  : ");
        String product_id = scan.next();
        scan.nextLine();
        System.out.print("Enter product name: ");
        String product_name = scan.nextLine();
        System.out.print("Enter product item: ");
        int product_item = scan.nextInt();
        System.out.print("Enter price per piece: ");
        double price_per_item = scan.nextDouble();
        DecimalFormat frm = new DecimalFormat("#,##0.00");

        System.out.println("------------------------------------");
        System.out.println("Product name: " + product_name + " (" + product_id + ")");
        System.out.println("Product item: " + product_item + " (" + frm.format(price_per_item) + " baht/piece)");
        System.out.println("Total price : " + frm.format(product_item*price_per_item) + " baht");
    }
}
