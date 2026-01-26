import java.text.DecimalFormat;

public class Ex201 {
    public static void main(String[] args) {
        String product_id = "PB-001",product_name = "Pencil Box";
        int product_item = 112;
        double price_per_item = 30.20;
        DecimalFormat frm = new DecimalFormat("#,##0.00");

        System.out.println("Product name: " + product_name + " (" + product_id + ")");
        System.out.println("Product item: " + product_item + " (" + frm.format(price_per_item) + " baht/piece)");
        System.out.println("Total price : " + frm.format(product_item*price_per_item) + " baht");
    }
}
