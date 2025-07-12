package libraryManagment;

import java.util.Scanner;

public class LibraryManagmentSystemDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Library library = new Library();
		library.addBook(new Book(1, "StrightDrive", "sachin" ));
		library.addBook(new Book(2, "CoverDrive", "virat"));
		library.addBook(new Book(3, "PullShot", "rohit"));
		library.addBook(new Book(4, "Mr.360", "abd"));
		library.addBook(new Book(5, "Keeping", "msd"));
		
		int choice;
		do {
			System.out.println("library Menu");
			System.out.println("1. addBook");
			System.out.println("2. SearchBook");
			System.out.println("3. IssueBook");
			System.out.println("4. DisplayBook");
			System.out.println("5. showStats");
			System.out.println("6. exit");
			System.out.println("enter a choice:");
			choice=sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				System.out.println("enter a book id");
				int id=sc.nextInt();
				sc.nextLine();
				 System.out.print("Enter title: ");
                 String title = sc.nextLine();
                 System.out.print("Enter author: ");
                 String author = sc.nextLine();
                 library.addBook(new Book(id, title, author));
                 System.out.println("Book added!");
                 break;
                 
			case 2:
				 System.out.print("Enter title or author keyword: ");
                 String keyword = sc.nextLine();
                 library.searchBook(keyword);
                 break;
                 
			case 3:
				System.out.println("enter a id");
			    int issuedId=sc.nextInt();
			    try {
			    	library.issueBook(issuedId);
			    }catch(BookNotAvailableException ex) {
			    	System.out.println("error:"+ex.getMessage());
			    }
			    	break;
			    	
			case 4:
				System.out.println("available Books");
				library.displayBooks();
				break;
				
			case 5:
				System.out.println("showStats");
				library.showStats();
				break;
				
			case 6:
				System.out.println("exit");
				break;
				
			default:
				System.out.println("invalid Choice");	
				
			    }
			}while(choice!=6);
		sc.close();
		}
			}
		


