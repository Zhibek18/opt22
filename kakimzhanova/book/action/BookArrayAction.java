package opt22.kakimzhanova.book.action;
import opt22.kakimzhanova.book.entity.*;

public class BookArrayAction{
	public static BookArray writtenBy(BookArray bookArr, String author){
		BookArray authorBooks = new BookArray();
		for (Book book : bookArr.getBooks()){
			for (String bookAuthor : book.getAuthors()){
				if (bookAuthor.equals(author)){
					authorBooks.addBook(book);
				}
			}
		}
		return authorBooks;
	}

	public static BookArray publishedBy(BookArray bookArr, String publisher){
		BookArray publisherBooks = new BookArray();
		for (Book book : bookArr.getBooks()){
			if (book.getPublishingHouse().equals(publisher)){
				publisherBooks.addBook(book);
			}		
		}
		return publisherBooks;
	}

	public static BookArray publishedSince(BookArray bookArr, int year){
		BookArray yearBooks = new BookArray();
		for (Book book : bookArr.getBooks()){
			if (book.getPublishingYear() > year){
				yearBooks.addBook(book);
			}
		}
		return yearBooks;
	}
}