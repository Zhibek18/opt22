package opt22.kakimzhanova.book.entity;

public class Book{
	static int bookCount = 0;
	int bookId;
	String name;
	String[] authors;
	String publishingHouse;
	int publishingYear;
	int pagesQuantity;
	double price;
	String bindingType;

	public Book(String name, String[] authors, 
		String publishingHouse, int publishingYear, 
		int pagesQuantity, double price, String bindingType){

		this.bookId = ++bookCount;
		this.name = name;
		this.authors = authors;
		this.publishingHouse = publishingHouse;
		this.publishingYear = publishingYear;
		this.pagesQuantity = pagesQuantity;
		this.price = price;
		this.bindingType = bindingType;
	}
	public Book(String name, String author, 
		String publishingHouse, int publishingYear, 
		int pagesQuantity, double price, String bindingType){

		String[] authors = {author};
		this.bookId = ++bookCount;
		this.name = name;
		this.authors = authors;
		this.publishingHouse = publishingHouse;
		this.publishingYear = publishingYear;
		this.pagesQuantity = pagesQuantity;
		this.price = price;
		this.bindingType = bindingType;
	}
	public String[] getAuthors(){
		return authors;
	}
	public String toString(){
		String s = "№";
		s += bookId + " ";
		s += name + " ";
		for (String author : authors){
			s+= author + " ";
		}
		s += "\n";
		s += "Издательство: '" + publishingHouse + "' ,";
		s += publishingYear +  "г. ";
		s += pagesQuantity + "c. ";
		s += bindingType + " переплет\n" ;
		return s;
	}
}