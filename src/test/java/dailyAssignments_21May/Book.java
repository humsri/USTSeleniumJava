package dailyAssignments_21May;

public class Book {
	
	String title;
	String author;
	double price;
	
	public void displayBook() {
		System.out.println("Book Title is - " + title);
		System.out.println("Book Author is - " + author);
		System.out.println("Book Price is - "+ price);
		
	}
	
	
	public static void main(String[] args) {
		Book b = new Book();
		b.title="Harry Potter";
		b.author="JK Rowling";
		b.price=750;
		b.displayBook();

	}

}
