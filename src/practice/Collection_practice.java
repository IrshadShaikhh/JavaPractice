package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collection_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		ArrayList<Integer> li = new ArrayList<Integer>();;
		Collections.addAll(li, 3,4,5,6,4,2,1,4,5);
		
		
	   if(li.size()<2)
	   {
		   System.out.println("not enoutgh element to find");
	   }
	   else
	   {
		   Collections.sort(li);
		   System.out.println(li.get(li.size()-2));
	   }
		
		*/
		
		List<Integer> li = new ArrayList<Integer>();
		Collections.addAll(li, 1,2,3,4,5,3,4);
		System.out.println(li);
		Set<Integer> se = new HashSet<Integer>(li);
		System.out.println(se);
	}

}
