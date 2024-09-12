package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator_demo1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Comparator<String> com = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				if(o1.length()>o2.length())
				{
					return 1;
				}
				return -1;
			}
		};
		
		List<String> li = new ArrayList<String>();
		li.add("irshad");
		li.add("adityaa");
		li.add("rushi");
		
		Collections.sort(li,com);
		System.out.println(li);
	}

}
