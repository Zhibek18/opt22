package opt22.kakimzhanova.book.entity;
import java.math.BigDecimal;
public class Book{
	static int bookCount = 0;
	int bookId;
	String name;
	String[] authors;
	String publishingHouse;
	int publishingYear;
	int pagesQuantity;
	BigDecimal price;
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
		this.price = new BigDecimal(price);
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
		this.price = new BigDecimal(price);
		this.bindingType = bindingType;
	}
	public String[] getAuthors(){
		return authors;
	}
	public String getPublishingHouse(){
		return publishingHouse;
	}
	public int getPublishingYear(){
		return publishingYear;
	}
	public String toString(){
		StringBuffer s = new StringBuffer("№");
		s.append(bookId);
		s.append(" ");
		s.append(name);
		s.append(" ");
		for (String author : authors){
			s.append(author + " ");
		}
		s.append("\n");
		s.append("Издательство: '");
		s.append(publishingHouse);
		s.append("' ,");
		s.append(publishingYear);
		s.append("г. ");
		s.append(pagesQuantity);
		s.append("c. ");
		s.append(price);
		s.append("тг. ");
		s.append(bindingType);
		s.append(" переплет\n");
		return s.toString();
	}
}