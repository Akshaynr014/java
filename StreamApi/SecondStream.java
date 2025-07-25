package com.dyashin.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SecondStream {
public static void main(String[] args) {
	List<String> list = new ArrayList<>();
	list.add("apple");
	list.add("mango");
	list.add("Banana");
	list.add("cherry");
	
	Stream<String> str = list.stream();
//	for (String string : list) {
//		System.out.println(string);
//	}
	str.forEach(System.out::println);
//	str.forEach(System.out::println);  //if we print second time it will give illigalstateexception
	String[] names= {"akshay","virat","rohith"};
	Stream<String> str1 =Arrays.stream(names);
	Stream.of(1,2,3,4);
	Stream.iterate(null, null);
	Stream.generate(null);
	
}
}
