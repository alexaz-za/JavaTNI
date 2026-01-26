public class Inventory {
    private String name;
    private int stock;
    Inventory(String name,int stock){
        this.name = name;
        this.stock = stock;
    }
    Inventory(String name){
//        this.name = name;
//        this.stock = 0;
        this(name,0);
    }
    Inventory(int stock){
        this("",stock);
    }
    Inventory(){
        this("",0);
    }
    String getName(){
        return this.name;
    }
    int getStock(){
        return this.stock;
    }
    void addStock(int amount){
        if (amount > 0) this.stock += amount;
    }
    void removeStock(int amount){
        if (amount > 0 && amount <= this.stock) this.stock -= amount;
    }
}
