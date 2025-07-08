
public class PaperBook extends Book {
	private int stock;
	public PaperBook(String ISBN, String title, int year, double price, String author, int stock) {
		super(ISBN, title, year, price, author);
		this.stock = stock;
	}
	@Override
	public double buyBook(int quantity, String email, String address) {
		// TODO Auto-generated method stub
		if (stock < quantity) {
			throw new IllegalStateException("Not enough stock!");
		}
		stock -= quantity;
		System.out.println(quantity + " copies of " + getTitle() + " are being shipped to " + address);
		return (getPrice()*quantity) + 50;
		
	}

}
