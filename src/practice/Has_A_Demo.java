package practice;

class Book
{
	String name;
	public Book(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
}
class Library
{
	private Book[] books;
	public Library(Book[] books)
	{
		this.books=books;
	}
	public void DisplayBooks()
	{
		for(Book book:books)
		{
			System.out.println("book "+book.getName());
		}
	}
 }
public class Has_A_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("Abc");
		Book b2 = new Book("xyz");
		Book b3 = new Book("prq");
		
		Book[] books = {b1,b2,b3};
		
		Library library = new Library(books);
		library.DisplayBooks();
	}

}
