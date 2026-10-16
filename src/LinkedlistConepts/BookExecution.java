package LinkedlistConepts;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BookExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("J.K. Rowling", "Harry Potter");
		Book b2 = new Book("Haruki Murakami", "Kafka on the Shore");
		Book b3 = new Book("J.K. Rowling", "Harry Potter");
		List<Book> book = new LinkedList<Book>();
		book.add(b1);
		book.add(b2);
		book.add(b3);
		for (Object obj : book) {
			System.out.println(obj);
		}
		Collections.sort(book);
		System.out.println(book);
	}

}
