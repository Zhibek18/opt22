package opt22.kakimzhanova.book.entity;
import java.util.Arrays;

public class BookArray{
	Book [] books;

	public void addBook(Book book){
		if (books != null){
			Book[] newBooks = Arrays.copyOf(books, books.length + 1);
			newBooks[books.length] = book;
			books = newBooks;
		}
		else{
			books = new Book[]{book};
		}
	}
	public String toString(){
		StringBuffer s = new StringBuffer("");
		if (books != null){
			for (Book book : books){
				s.append(book);
			}
		}
		return s.toString();
	}
	public Book[] getBooks(){
		return books;
	}

}