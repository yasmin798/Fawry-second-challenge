import java.util.*;
public class Main {
	public static void main(String[] args) {
        QuantumBookstore bookstore = new QuantumBookstore();
        System.out.println("=== Testing Adding Books ===");
        bookstore.addBook(new PaperBook("123456", "The Guest List",  2020, 70.0, "Lucy Foley", 15));
        bookstore.addBook(new EBook("123457", "Project Hail Mary",  2021, 60.50, "Andy Weir", "PDF"));
        bookstore.addBook(new ShowcaseBook("123458", "The Maid", 2022 ,0.0, "Nita Prose"));
        
        System.out.println("=== Testing Buying Books ===");
        try {
            double cost = bookstore.purchaseBook("123456", 2, null, "123 Wall St");
            System.out.println( cost + "EGP is paid for paper book purchase");
        } catch (Exception e) {
            System.out.println("Error - " + e.getMessage());
        }
        try {
            double cost = bookstore.purchaseBook("123457", 1, "john@gmail.com", null);
            System.out.println( cost + "EGP is paid for ebook purchase");
        } catch (Exception e) {
            System.out.println("Error - " + e.getMessage());
        }
        try {
            bookstore.purchaseBook("123458", 1, null, null);
        } catch (Exception e) {
            System.out.println("Error - " + e.getMessage());
        }

        try {
            bookstore.purchaseBook("123456", 66, null, "123 River St");
        } catch (Exception e) {
            System.out.println("Error - " + e.getMessage());
        }
        System.out.println("=== Testing Removing Books ===");
        bookstore.addBook(new PaperBook("123456", "Revival",  2014, 70.0, "Stephen King", 15));
        List<Book> removedBooks = bookstore.removeOutdatedBooks(2025, 5);
        System.out.println(removedBooks.size() + " were removed due to being outdated.");
}
}
