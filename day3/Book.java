package libraryManagment;

public class Book {
int id;
String title;
String author;
boolean isIssued;

public Book(int id, String title, String author) {
	super();
	this.id = id;
	this.title = title;
	this.author = author;
	this.isIssued = false;
}

@Override
public String toString() {
	return "Book [id=" + id + ", title=" + title + ", author=" + author + ", isIssued=" + isIssued + "]";
}



}
