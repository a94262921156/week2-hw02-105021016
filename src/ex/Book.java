package ex;

public class Book {
	private String name,Author,isbn,category;
	private int pages;
	public Book(String name1, String Author1, String isbn1, String category1, int pages1){
		name = name1;
		Author = Author1;
		isbn = isbn1;
		category = category1;
		pages = pages1;
	}
	public String getName(){
		return name;
	}
	public String getISBN(){
		return isbn;
	}
	public String getCategory(){
		return category;
	}
	public void showAll(){
		System.out.print(name + ',');
		System.out.print(isbn + ',');
		System.out.println(pages);
	}
	public void showAuthor(){
		 System.out.println(name + ',');
		 System.out.println(Author);
	 }
}
