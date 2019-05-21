package opt22.kakimzhanova.book.main;
import opt22.kakimzhanova.book.entity.Book;

public class Runner{
	public static void main(String[] args) {
		String[] authors = {"А.Н.Стругацкий","Б.Н.Стругацкий"};
		Book book = new Book(1,"Жук в муравейнике", authors, "Текст", 1991, 428, 15, "Твердый");
		System.out.println(book);
	}
}