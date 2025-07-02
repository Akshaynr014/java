package logicalProblem;

import java.util.Arrays;

public class AnagramCheck {

	public static void main(String[] args) {
		String s1="silent";
		String s2= "listen";
		
		
		s1=s1.replaceAll("\\s","").toLowerCase();
		s2=s2.replaceAll("\\s","").toLowerCase();
		if(s1.length()!=s2.length()) {
			System.out.println("it is not Anagram");
		}
		
		char[] array1 = s1.toCharArray();
		char[] array2 = s2.toCharArray();
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		if (Arrays.equals(array1, array2)) {
			System.out.println("It is anagram");
		}else {
			System.out.println("It is not anagram");
		}

	}

}
