package student;

import java.util.Scanner;

public class StudentRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("enter a name of Student:");
			String name = scanner.nextLine();

			System.out.println("enter a rollNumber:");
			String rollNumber = scanner.nextLine();

			System.out.println("enter a subjects");
			int n = scanner.nextInt();
			scanner.nextLine();

			StudentSubject[] subjects = new StudentSubject[n];
			for (int i = 0; i < n; i++) {

				System.out.println("enter a subject name " + (i + 1) + ":");
				String subjectName = scanner.nextLine();

				System.out.println("enter a marks " + subjectName + ":");
				int marks = scanner.nextInt();
				scanner.nextLine();

				if (marks < 0 || marks > 100) {
					throw new Exception("Marks must be between 0 and 100");

				}
				subjects[i] = new StudentSubject(subjectName, marks);

			}
			Students students = new Students(name, rollNumber, subjects);

			students.showDetails();

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			
		}
		scanner.close();
	}

}
