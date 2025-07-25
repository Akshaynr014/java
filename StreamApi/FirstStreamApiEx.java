package com.dyashin.stream;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FirstStreamApiEx {

	public static void main(String[] args) {
//		ArrayList<Integer> arrayList = new ArrayList<>();
//		for (int i = 1; i < 10; i++) {
//			if (i % 2 == 0) {
//				arrayList.add(i);
//			}
//		}
//		System.out.println(arrayList);
		
		List<Integer> number=Arrays.asList(33334,1,2,3,4,5,6,7,8,9,23,44,4,6,2838);
//		number.stream().filter(n->n%2==0).forEach(System.out::println);
		
		List<Integer> collect = number.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(collect);
		List<Integer> collect1 = number.stream().filter(n->n%2==0).map(n->n/2).collect(Collectors.toList());
		System.out.println(collect1);
		List<Integer> collect2 = number.stream().filter(n->n%2==0).map(n->n/2).distinct().collect(Collectors.toList());
		System.out.println(collect2);
		
		List<Integer> collect3 = number.stream().filter(n->n%2==0).map(n->n/2)
				.distinct().sorted((a,b)->(b-a))
				.collect(Collectors.toList());
		System.out.println(collect3);
		
		List<Integer> collect4 = number.stream().filter(n->n%2==0).map(n->n/2)
				.distinct().sorted((a,b)->(b-a)).limit(2).skip(1)
				.collect(Collectors.toList());
		System.out.println(collect4);
	}

}
