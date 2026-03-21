package BookShop;

import java.io.IOException;
import java.util.Arrays; // เพิ่มเข้ามาเพื่อจัดการ Array

public class CartManager {
    private final Book[] cartItems;
    private int itemCount; //ตัวแปรนับจำนวนของในตะกร้า
    private final Stock stock;
    private static final int maximum_cart_item = 100; //กำหนดขนาดสูงสุดของ cart

    public CartManager(Stock stock) {
        this.stock = stock;
        this.cartItems = new Book[maximum_cart_item];
        this.itemCount = 0;
    }

    public boolean addToCart(String title) {
        if (itemCount >= maximum_cart_item) {
            return false; //ถ้าตะกร้าเต็ม ไม่ให้เพิ่ม
        }

        Book bookInStock = stock.findByTitle(title);
        if (bookInStock != null && bookInStock.getQuantity() > 0) {
            stock.reduceStock(title, 1);
            //เพิ่มลง array
            cartItems[itemCount] = new Book(bookInStock.getTitle(), bookInStock.getAuthor(), bookInStock.getPrice(), 1);
            itemCount++; //เพิ่มจำนวนนับ
            saveStockChanges();
            return true;
        }
        return false;
    }

    public boolean removeFromCart(String title) {
        for (int i = 0; i < itemCount; i++) {
            if (cartItems[i].getTitle().equals(title)) {
                stock.addStock(title, 1);

                //ขยับข้อมูลช่องถัดไปมาทับช่องที่ถูกลบ (shift elements left)
                for (int j = i; j < itemCount - 1; j++) {
                    cartItems[j] = cartItems[j + 1];
                }

                cartItems[itemCount - 1] = null; //เคลียร์ช่องสุดท้าย
                itemCount--;                     //ลดจำนวนนับลง

                saveStockChanges();
                return true;
            }
        }
        return false;
    }

    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += cartItems[i].getPrice();
        }
        return total;
    }

    public void checkout() {
        //เคลียร์ข้อมูลในตะกร้าทั้งหมด
        for (int i = 0; i < itemCount; i++) {
            cartItems[i] = null;
        }
        itemCount = 0; //รีเซ็ตตัวนับ
    }

    public void saveStockChanges() {
        try {
            stock.saveToFile();
        } catch (IOException e) {
            System.out.println("Error saving stock during cart operation");
        }
    }

    public Book[] getCartItems() {
        //สร้าง array ใหม่ขนาดเท่ากับจำนวนของในตะกร้าจริงๆ
        Book[] activeItems = new Book[itemCount];

        //วนลูปย้ายข้อมูลจาก (cartItems) มาใส่ array ใหม่
        for (int i = 0; i < itemCount; i++) {
            activeItems[i] = cartItems[i];
        }

        //ส่ง array ที่ (ไม่ null) ออกไป
        return activeItems;
    }

    public boolean isEmpty() {
        return itemCount == 0;
    }
}