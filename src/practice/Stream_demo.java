package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_demo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,3,4,5,6,7,6,1,9,10,1,5,24,7,8,9,2,444);
		List<Integer>  evenlist=list.stream()
				.filter(n->n%2==0).map(x->x*2)
				.distinct()
				.sorted((a,b)->(b-a))
				.limit(5)
				.collect(Collectors.toList());
		System.out.println(evenlist);
		
		
	 List<Integer> collect = Stream.iterate(0,x ->x+1)
			 .limit(101)
			 .skip(1)
			 .filter(x->x%2==0)
			 .distinct()
			 .sorted()
			 .peek(x->System.out.println(x))
			 .map(x->x/10)
			 .collect(Collectors.toList());
	 System.out.println(collect);
	} 

}
