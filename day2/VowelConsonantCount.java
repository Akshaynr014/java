package string;


	public class VowelConsonantCount {
	    public static void main(String[] args) {
	        String str = "Akshay";
	        int vowels = 0, consonants = 0;

	        str = str.toLowerCase();

	        for (char ch : str.toCharArray()) {
	            if (Character.isLetter(ch)) {
	                if ("aeiou".indexOf(ch) != -1)
	                    vowels++;
	                else
	                    consonants++;
	            }
	        }

	        System.out.println("Vowels: " + vowels);
	        System.out.println("Consonants: " + consonants);
	    }
	}


