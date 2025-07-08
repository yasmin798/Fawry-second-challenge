import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class QuantumBookstore {
	private Map<String, Book> inventory;

    public QuantumBookstore() {
        this.inventory = new HashMap<>();
    }
    public void addBook(Book b) {
    	inventory.put(b.getISBN(), b);
    	System.out.println(b.getTitle() + " is added to inventory.");
    }
    public List<Book> removeOutdatedBooks(int currentYear, int yearsLimit) {
        List<Book> removedBooks = new ArrayList<>();
        Iterator<Map.Entry<String, Book>> iterator = inventory.entrySet().iterator();
        
        while (iterator.hasNext()) {
            Book b = iterator.next().getValue();
            if (currentYear - b.getYear() > yearsLimit) {
                removedBooks.add(b);
                iterator.remove();
                System.out.println(b.getTitle() + " is removed due to being outdated.");
            }
        }
        return removedBooks;
    }
    public double purchaseBook(String isbn, int quantity, String email, String address) throws Exception {
        Book b = inventory.get(isbn);
        if (b == null) {
            throw new IllegalArgumentException("Book with ISBN " + isbn + " is not found");
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("Please provide a valid quantity.");
        }
        return b.buyBook(quantity, email, address);
    }
}
