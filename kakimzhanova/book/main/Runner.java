package opt22.kakimzhanova.book.main;
import opt22.kakimzhanova.book.entity.Book;
import opt22.kakimzhanova.book.entity.BookArray;
public class Runner{
	public static void main(String[] args) {
		String[] authors = {"А.Н.Стругацкий","Б.Н.Стругацкий"};
		Book myBook = new Book("Жук в муравейнике", authors, "Текст", 1991, 428, 15, "Твердый");
		Book yourBook = new Book("Анна Каренина", "Л.Н.Толстой", "АСТ", 2016, 864, 990, "Мягкий");
		Book hisBook = new Book("Война и мир", "Л.Н.Толстой", "АСТ", 1981, 1084, 1060, "Твердый");
		BookArray ourBooks = new BookArray();
		ourBooks.addBook(myBook);
		ourBooks.addBook(yourBook);
		ourBooks.addBook(hisBook);
		//System.out.println(ourBooks.writtenBy("Л.Н.Толстой"));
		//System.out.println(ourBooks.publishedBy("АСТ"));
		System.out.println(ourBooks.publishedSince(2000));
		//System.out.println(ourBooks);
	}
}