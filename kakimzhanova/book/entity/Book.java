package opt22.kakimzhanova.book.entity;

public class Book{
	int bookId;
	String name;
	String[] authors;
	String publishingHouse;
	int publishingYear;
	int pagesQuantity;
	double price;
	String bindingType;

	public Book(int bookId, String name, String[] authors, 
		String publishingHouse, int publishingYear, 
		int pagesQuantity, double price, String bindingType){

		this.bookId = bookId;
		this.name = name;
		this.authors = authors;
		this.publishingHouse = publishingHouse;
		this.publishingYear = publishingYear;
		this.pagesQuantity = pagesQuantity;
		this.price = price;
		this.bindingType = bindingType;
	}
	public Book(int bookId, String name, String author, 
		String publishingHouse, int publishingYear, 
		int pagesQuantity, double price, String bindingType){

		String[] authors = {author};
		this.bookId = bookId;
		this.name = name;
		this.authors = authors;
		this.publishingHouse = publishingHouse;
		this.publishingYear = publishingYear;
		this.pagesQuantity = pagesQuantity;
		this.price = price;
		this.bindingType = bindingType;
	}

	public String toString(){
		String s = "№";
		s += bookId + " ";
		s += name + " ";
		for (String author : authors){
			s+= author + " ";
		}
		s += "\n";
		s += "Издательство: '" + publishingHouse + "' ";
		s += publishingYear +  "г. ";
		s += pagesQuantity + "c. ";
		s += bindingType + " переплет" ;
		return s;
	}
}