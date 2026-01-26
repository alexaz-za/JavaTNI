public class Book {
    private String title;
    private String category;
    private double price;
    private int discount_percent;
    private Author author;

    Book(String title,String category,double price,Author author){
        this.title = title;
        this.category = category;
        this.price = price;
        this.author = author;
        this.discount_percent = 0;
    }
    Book(){
        this("","",0.0,null);
    }
    Author getAuthor() {
        return this.author;
    }
    String getTitle(){
        return this.title;
    }
    void setDiscount_percent(int percent){
        this.discount_percent = discount_percent;
    }
    int getDiscount_percent(){
        return this.discount_percent;
    }
    boolean isDiscountAvailable(){
        return this.price > 500;
    }
    double calculateDiscountPrice(){
        return this.price-(this.price*getDiscount_percent()/100);
    }
    public String toString(){
        return "Title   : " + this.title +
                "\nCategory: " + this.category +
                "\nPrice   : " + this.price + (isDiscountAvailable() ? "("+calculateDiscountPrice()+")" : "") +
                "\nAuthor  : " + this.author.showAuthorInfo();
    }
}
