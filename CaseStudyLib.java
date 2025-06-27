package week1.day2;

public class CaseStudyLib {
	
	String borrowBook(int bookId, String title, String author)
	{
		System.out.println("User1 borrowed the book from user2 is:" +bookId +title +author);
		System.out.println("user of this book is updated:" +bookId );
		return author;
	
	}
	String returnBook(String bookName)
	{
		boolean isAvailable=true;
		if(bookName=="Kalki")
		{
			System.out.println("The user returned the book &  book is available:" +isAvailable);
		}
		else
		{
			System.out.println("The boom is not rteurned by user & it is not available");
		}
		return bookName;
		
	}
	void displayDetails(int totalNoofBooksAvailable)
	{
		System.out.println("The total no of numbers available in library is:" +totalNoofBooksAvailable);
	}
	

	public static void main(String[] args) {
		CaseStudyLib lib=new CaseStudyLib();
		lib.borrowBook(2345, "Mahabharatanam", "Vyasa");
		lib.returnBook("Kalk");
		lib.displayDetails(2345678);
		

	}

}
