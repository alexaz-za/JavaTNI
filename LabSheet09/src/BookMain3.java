import java.util.Scanner;

public class BookMain3 {
    static Scanner sc = new Scanner(System.in);
    public static Book[] book_initial() {
        Book[] books = new Book[]{
                new Book("Java Programming", "Computers", 325.75, new Author("Malee")),
                new Book("English 101", "Languages", 200, new Author("Tipco")),
                new Book("Japanese 101", "Languages", 210, new Author("Tipco")),
                new Book("R Programming", "Computers", 400, new Author("Malee"))
        };
        return books;
    }

    public static void main(String[] args) {
        Book[] books = book_initial();
        System.out.print("Enter author's name: ");
        String author_name = sc.next();
        int count = 0;
        for (int i = 0;i<books.length;i++){
            if (books[i].getAuthor().getName().equalsIgnoreCase(author_name)){
                System.out.println("- " + books[i].getTitle());
                count++;
            }
        }
        if (count == 0){
            System.out.println("No books found from this author...");
        }
    }
}
