package BookShop;

public class Book {
    private String title;
    private String author;
    private double price;
    private int quantity;

    public Book(String title, String author, double price, int quantity) {
        this.title    = title;
        this.author   = author;
        this.price    = price;
        this.quantity = quantity;
    }

    public Book() {
        this("", "", 0.0, 0);
    }

    public String getTitle() { return this.title; }
    public String getAuthor() { return this.author; }
    public double getPrice() { return this.price; }
    public int    getQuantity() { return this.quantity; }

    public void setQuantity(int quantity) { this.quantity = quantity; }

    public static Book fromTextLine(String textLine) {
        String[] parts = textLine.split(",");
        if (parts.length < 4) return null;

        String title = parts[0].trim();
        String author = parts[1].trim();
        double price = Double.parseDouble(parts[2].trim());
        int quantity = Integer.parseInt(parts[3].trim());

        return new Book(title, author, price, quantity);
    }

    public String toTextLine() {
        return title + "," + author + "," + price + "," + quantity;
    }

    @Override
    public String toString() {
        return "Title: " + title + " | Author: " + author + " | Price: " + price + " | Stock: " + quantity;
    }
}