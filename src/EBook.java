
public class EBook extends Book {
	private String fileType;

	public EBook(String ISBN, String title, int year, double price, String author, String fileType) {
		super(ISBN, title, year, price, author);
		this.fileType = fileType;
	}

	@Override
	public double buyBook(int quantity, String email, String address) {
		// TODO Auto-generated method stub
		System.out.println(quantity + " copies of " + getTitle() + " are being sent to " + email);
		return (getPrice()*quantity);
	}

}
