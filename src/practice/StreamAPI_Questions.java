package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI_Questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li = Arrays.asList(2,3,4,5,6,7,8,9,10);
		List<Integer> even = li.stream().filter(n -> n%2==0).collect(Collectors.toList());
		System.out.println(even);
		
		
		int maxno = li.stream().max(Integer :: compare).orElse(null);
		System.out.println(maxno);
		
		List<String> li1 = Arrays.asList("apple", "banana", "cherry");
		List<String> uppercase = li1.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(uppercase);
		
		List<Integer> li2 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		long countno =  li2.stream().filter(n->n>5).count();
		System.out.println(countno);
		
		Optional findfirstt = li2.stream().filter(n->n>5).findFirst();
		System.out.println(findfirstt);
		
		int sum = li2.stream().reduce(0, Integer::sum);
		System.out.println(sum);
		
		List<Integer> li3 = Arrays.asList(2,2,3,3,4,5,4);
		List<Integer> distinctele = li3.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctele);
		
		
		List<String> li4 = Arrays.asList("apple", "banana", "cherry");
		String concatString = li4.stream().collect(Collectors.joining(","));
		System.out.println(concatString);
		 
	}

}
