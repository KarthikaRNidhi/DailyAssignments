package week1.day2;

public class Library {
	String addBook(String bookTitle)
	{
		System.out.println("Book added sucessfully");
		return bookTitle;
	}
	
	void issueBook()
	{
		System.out.println("Book issued sucessfully");
	}

	public static void main(String[] args) {
		Library lib=new Library();
		lib.addBook("ponniyanSelvan");
		lib.issueBook();
		

	}

}
