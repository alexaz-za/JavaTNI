import java.util.Scanner;

public class InventoryMain {
    static void showInfo(Inventory product){;
        System.out.println("Product name : " + product.getName()+
                "\nCurrent stock: " + product.getStock() +
                "\n---------------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Inventory product1 = new Inventory("Pen",10);

        while (true) {
            showInfo(product1);
            System.out.println("Press 1 to add item in stock" +
                    "\nPress 2 to remove item from stock");
            System.out.print("Enter a menu: ");
            int option = sc.nextInt();

            if (option == 1){
                System.out.print("How many item to add in stock: ");
                product1.addStock(sc.nextInt());
                System.out.println();
            }
            else if (option == 2){
                System.out.print("How many item to remove from stock: ");
                product1.removeStock(sc.nextInt());
                System.out.println();
            }
            else break;
        }
        System.out.println("END PROGRAM");
    }
}
