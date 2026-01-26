import javax.swing.*;

public class BookMain2 {
    public static void main(String[] args) {
        //NO.1
        String author_name = JOptionPane.showInputDialog("Enter author's name:");
        //NO.2
        int option = JOptionPane.showConfirmDialog(null,"Do you prefer to publish your nationality and birth year?");

        Author author;

        if (option == JOptionPane.YES_OPTION){
            String nationality = JOptionPane.showInputDialog("Input author's nationality:");
            String birthyear = JOptionPane.showInputDialog("Input author's birthyear:");
            author = new Author(author_name,nationality,Integer.parseInt(birthyear));
        } else {
            author = new Author(author_name);
        }
        //NO.3
        JOptionPane.showMessageDialog(null,author.showAuthorInfo());
        //NO.4
        String title = JOptionPane.showInputDialog("Enter book title:");
        String category = JOptionPane.showInputDialog("Enter book category:");
        double price = Double.parseDouble(JOptionPane.showInputDialog("Enter book price:"));
        //NO.5
        Book book = new Book(title,category,price,author);
        //NO.6
        if (book.isDiscountAvailable()) {
            //NO.6a
            //int discount_percent = Integer.parseInt(JOptionPane.showInputDialog("Input discount %:"));
            book.setDiscount_percent(Integer.parseInt(JOptionPane.showInputDialog("Input discount %:")));
        }
        //NO.7
        JOptionPane.showMessageDialog(null,book);

    }
}
