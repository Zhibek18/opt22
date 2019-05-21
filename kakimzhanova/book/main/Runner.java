package opt22.kakimzhanova.book.main;
import opt22.kakimzhanova.book.entity.Book;
import opt22.kakimzhanova.book.entity.BookArray;
public class Runner{
	public static void main(String[] args) {
		String[] authors = {"А.Н.Стругацкий","Б.Н.Стругацкий"};
		Book myBook = new Book("Жук в муравейнике", authors, "Текст", 1991, 428, 15, "Твердый");
		Book yourBook = new Book("Анна Каренина", "Л.Н.Толстой", "АСТ", 2016, 864, 990, "Мягкий");
		
		BookArray ourBooks = new BookArray();
		ourBooks.addBook(myBook);
		ourBooks.addBook(yourBook);
		System.out.println(ourBooks);
	}
}