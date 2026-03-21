package BookShop;

import java.io.*;
import java.util.Scanner;

public class Stock {
    private final Book[] books;
    private int bookCount; //ตัวแปรนับจำนวนหนังสือที่มีอยู่จริง
    private final String filePath;
    private static final int maximum_books = 1000; //กำหนดขนาด stock

    public Stock(String filePath) {
        this.filePath = filePath;
        this.books = new Book[maximum_books];
        this.bookCount = 0; //เริ่มต้นที่ 0 เล่ม
    }

    public void loadFromFile() throws FileNotFoundException {
        bookCount = 0; //เคลียร์ค่าเดิม
        File file = new File(filePath);
        if (!file.exists()) return;

        Scanner sc = new Scanner(file);
        while (sc.hasNextLine() && bookCount < maximum_books) { //เช็คไม่ให้เกินขนาด Array
            String line = sc.nextLine().trim();
            if (!line.isEmpty()) {
                Book b = Book.fromTextLine(line);
                if (b != null) {
                    books[bookCount] = b; // เก็บลง Array ตามตำแหน่ง
                    bookCount++;          // เพิ่มจำนวนนับ
                }
            }
        }
        sc.close();
    }

    public void saveToFile() throws IOException {
        new File(filePath).getParentFile().mkdirs();
        try (PrintWriter writer = new PrintWriter(filePath)) {
            //วนลูปเฉพาะจำนวนที่มีอยู่จริง (ไม่ใช่ความจุสูงสุด)
            for (int i = 0; i < bookCount; i++) {
                writer.println(books[i].toTextLine());
            }
        }
    }

    public Book findByTitle(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) return books[i];
        }
        return null;
    }

    public void addStock(String title, int amount) {
        Book b = findByTitle(title);
        if (b != null) {
            b.setQuantity(b.getQuantity() + amount);
        }
    }

    public boolean reduceStock(String title, int amount) {
        Book b = findByTitle(title);
        if (b != null && b.getQuantity() >= amount) {
            b.setQuantity(b.getQuantity() - amount);
            return true;
        }
        return false;
    }

    public Book[] getBooks() {
        //สร้าง array ใหม่ที่มีขนาดเท่ากับจำนวนหนังสือที่มีอยู่จริง
        Book[] activeBooks = new Book[bookCount];

        //วนลูป copy ข้อมูลทีละช่อง
        for (int i = 0; i < bookCount; i++) {
            activeBooks[i] = books[i];
        }

        //ส่ง array ใหม่ที่ไม่มีค่า null ปนออกไป
        return activeBooks;
    }
}