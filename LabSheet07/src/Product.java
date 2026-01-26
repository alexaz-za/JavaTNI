public class Product {
    String name;
    double price = 0;
    int quantity = 0;
    void addStock(int amount){
        if (amount > 0) quantity++;
        System.out.println("Added " + amount + "items to stock");
    }
    void sell(int amount){
        if (amount <= quantity) {
            quantity -= amount;
            System.out.println("Sold " + amount + " items");
            System.out.println("----------------------------------------    ");
        }
        else if (amount > quantity) System.out.println("Not enough items in stock...");

    }
    void changePrice(double newPrice){
        if (newPrice > 0 || newPrice > 0) System.out.println("Change price to " + newPrice + " baht");
    }
    double stockValue(){
        return price * quantity;
    }
    void showInfo(){
        System.out.println("Name  : " + name +
                           "\nPrice : " + price + " Baht/Item" +
                           "\nStock : " + quantity + " Items" +
                           "\nStock Value: " + stockValue() + " Baht" +
                           "\n----------------------------------------");
    }
}
