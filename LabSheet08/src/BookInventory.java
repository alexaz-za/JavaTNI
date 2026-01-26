import javax.swing.*;

public class BookInventory {
    public static void main(String[] args) {
        Book[] books = new Book[3];

        for (int i = 0; i < books.length;i++){
            String title = JOptionPane.showInputDialog("Enter book title:");
            int totalBook = Integer.parseInt(JOptionPane.showInputDialog("Enter the total number:"));
            books[i] = new Book(title,totalBook);
            System.out.println(books[i].getTitle() + " has " + books[i].getTotalBook() + " books, can borrow " + books[i].getAvailableBook() + " books.");
        }
    }
}
