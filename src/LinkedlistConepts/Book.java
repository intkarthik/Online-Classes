package LinkedlistConepts;

public class Book implements Comparable<Book> {
	String authorName;
	String title;

	public Book(String authorName, String title) {
		this.authorName = authorName;
		this.title = title;
	}

	@Override
	public String toString() {
		return " AuthorName : " + authorName + "," + " Title : " + title;

	}

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return o.authorName.compareTo(this.authorName);
	}

}
