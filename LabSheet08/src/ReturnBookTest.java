import javax.swing.*;

public class ReturnBookTest {
    public static void main(String[] args) {
        Book book = new Book("Java Programming",5);

        int option = JOptionPane.showConfirmDialog(null,"Do you want to borrow/return book?","Borrow/Return Book",JOptionPane.YES_NO_OPTION);
        while (option == JOptionPane.YES_OPTION){
            int input = Integer.parseInt(JOptionPane.showInputDialog("Press 1 to borrow book" +
                    "\nPress 2 to return book"));
            if (input == 1){
                if (book.getAvailableBook() != 0) {
                    book.borrowBook();
                    System.out.println("Borrowed 1 book, available " + book.getAvailableBook() + " books.");
                }
                else if (book.getAvailableBook() == 0){
                    JOptionPane.showMessageDialog(null,"No books available to borrow...","Warning Message",JOptionPane.WARNING_MESSAGE);
                }
            }
            else if (input == 2){
                if (book.getTotalBook() == book.getAvailableBook()) {
                    JOptionPane.showMessageDialog(null,"Cannot return! All books are already here.","Warning Message",JOptionPane.WARNING_MESSAGE);
                }
                else if (book.getAvailableBook() != 0){
                    book.retureBook();
                    System.out.println("Returned 1 book, available " + book.getAvailableBook() + " books.");
                }
            }
            else break;
            option = JOptionPane.showConfirmDialog(null,"Do you want to borrow/return book?","Borrow/Return Book",JOptionPane.YES_NO_OPTION);
        }
        JOptionPane.showMessageDialog(null,"END PROGRAM");
    }
}
