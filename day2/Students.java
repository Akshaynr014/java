package student;

public class Students {
	String name;
	String rollNumber;
	StudentSubject[] subjects;
	String Status;

	public Students(String name, String rollNumber,StudentSubject[] subjects) {
		
		this.name = name.trim();
		this.rollNumber = rollNumber;
		this.subjects = subjects;
		this.Status = CheckStatus();
	}
	 String CheckStatus() {
	        for (StudentSubject subject : subjects) {
	            if (subject.marks < 35) return "Fail";
	        }
	        return "Pass";
	    
	}
	
	void showDetails() {
		StringBuilder sb = new StringBuilder();
		sb.append("name:").append(name).append("\n");
		sb.append("rollNumber:").append(rollNumber).append("\n");
		sb.append("subjects and marks:\n");
		for(StudentSubject subject:subjects) {
			sb.append("- ").append(subject.subjectName).append(":").append(subject.marks).append("\n");
		}
		sb.append("status:").append(Status).append("\n");
		System.out.println(sb);
	}

}
