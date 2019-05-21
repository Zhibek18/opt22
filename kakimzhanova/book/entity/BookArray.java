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
		String s = "BookArray:\n";
		if (books != null){
			for (Book book : books){
				s += book;
			}
		}
		return s;
	}
	public BookArray writtenBy(String author){
		BookArray authorBooks = new BookArray();
		for (Book book : books){
			for (String bookAuthor : book.getAuthors()){
				if (bookAuthor.equals(author)){
					authorBooks.addBook(book);
				}
			}
		}
		return authorBooks;
	}

	public BookArray publishedBy(String publisher){
		BookArray publisherBooks = new BookArray();
		for (Book book : books){
			if (book.getPublishingHouse().equals(publisher)){
				publisherBooks.addBook(book);
			}		
		}
		return publisherBooks;
	}

	public BookArray publishedSince(int year){
		BookArray yearBooks = new BookArray();
		for (Book book : books){
			if (book.getPublishingYear() > year){
				yearBooks.addBook(book);
			}
		}
		return yearBooks;
	}

}