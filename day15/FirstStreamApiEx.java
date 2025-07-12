package com.dyashin.stream;


import java.util.Arrays;
import java.util.List;

public class FirstStreamApiEx {

	public static void main(String[] args) {
//		ArrayList<Integer> arrayList = new ArrayList<>();
//		for (int i = 1; i < 10; i++) {
//			if (i % 2 == 0) {
//				arrayList.add(i);
//			}
//		}
//		System.out.println(arrayList);
		
		List<Integer> number=Arrays.asList(1,2,3,4,5,6,7,8,9);
		number.stream().filter(n->n%2==0).forEach(System.out::println);
	}

}
