package libraryManagment;

import java.util.ArrayList;

public class Library {
	ArrayList<Book> books = new ArrayList<>();
	int issuedCount = 0;

//add book
	public void addBook(Book book) {
		books.add(book);
	}

//search book by author and title
public void searchBook(String keyword) {
	boolean found = false;
	for(Book b:books) {
		if(b.title.toLowerCase().contains(keyword.toLowerCase())||b.author.toLowerCase().contains(keyword.toLowerCase())) {
		System.out.println(b);
		found=true;
	}
}
	if(!found) {
		System.out.println("Book is not available in tha name"+keyword);
	}
}

//issue book by id
	public void issueBook(int id) throws BookNotAvailableException {
		for (Book b : books) {
			if (b.id == id) {
				if (!b.isIssued) {
					b.isIssued = true;
					issuedCount++;
					System.out.println("book is issued" + b.title);
					return;
				} else {
					throw new BookNotAvailableException("book is already issued" + b.title);
				}
			}
		}
		System.out.println("Book with ID " + id + " not found.");

	}
	//display a available books
	public void displayBooks() {
		boolean available = false;
		for(Book b:books) {
			if(!b.isIssued) {
				System.out.println(b);
				available=true;
			}	
			}
		if(!available) {
			System.out.println("book is not available");
		}
		}
	public void showStats() {
		System.out.println("Total books :"+books.size());
		System.out.println("Issued Books:"+issuedCount);
		System.out.println("Available Books:"+(books.size()-issuedCount));
	
	}
}
