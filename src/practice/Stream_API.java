package practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.jar.Attributes.Name;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream_API {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<Integer> li = Arrays.asList(2,3,4,5,6,7);
			
			
			System.out.println();
			System.out.println("Even no");
		    li.stream().filter(p -> p%2==0).forEach(n->System.out.print(n+" "));
		    
			System.out.println();
		    System.out.println("odd no");
		    li.stream().filter(p1 -> p1%2==1).forEach(n-> System.out.print(n+" "));
		    
		    
			System.out.println();
		    List<String> li1 = Arrays.asList("apple", "banana", "cherry");
		    System.out.println("convert to upper case");
		   List<String> word = li1.stream().map(String::toUpperCase).collect(Collectors.toList());
		   System.out.println(word);
		   
		   
		   System.out.println();
		   System.out.println("sum  squared of even no");
		  int sum = li.stream().filter(p4-> p4%2==0).map(n-> n+n).reduce(0, Integer::sum);
		  System.out.println(sum);
		  
		  List<String> names = Arrays.asList("Alice", "Bob", "Ankit", "Aman", "Stevee");
		  long count = names.stream().filter(name -> name.startsWith("A")).count();
		  System.out.println(count);
		  
		  String longest = names.stream().reduce((word1, word2)->word1.length()>word2.length() ? word1:word2).orElse(null);
		  System.out.println(longest);
		  
		  List<String> sortlength = names.stream().sorted((s1,s2)-> Integer.compare(s1.length(), s2.length())).collect(Collectors.toList());
		  System.out.println(sortlength);
		  
		  List<Integer> lii = Arrays.asList(2,32,3,44,31,3,1);
		  int greater = lii.stream().filter(n -> n>10).findFirst().orElse(null);
		  System.out.println(greater);
		  
		  int max = lii.stream().max(Integer :: compare).orElse(null);
		  System.out.println(max);
		  
		  
	}

}
