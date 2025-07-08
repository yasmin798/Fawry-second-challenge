
public class ShowcaseBook extends Book {

	public ShowcaseBook(String ISBN, String title, int year, double price, String author) {
		super(ISBN, title, year, 0.0, author);
	}

	@Override
	public double buyBook(int quantity, String email, String address) throws Exception{
		// TODO Auto-generated method stub
		throw new Exception("Demo books are not for sale.");
	}

}
