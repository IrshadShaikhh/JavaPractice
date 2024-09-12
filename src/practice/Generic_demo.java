package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Generic_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     //withoiut generic we need to fo typecasting
		List  li1 = new ArrayList();
		li1.add("hie");
		String s1=(String)li1.get(0);
		System.out.println(s1);

		
		  //when using generic dont need typecasting
		List<String>  li = new ArrayList<String>();
		li.add("hello");
		li.add("hie");
		li.add("java");
		String s=li.get(0);
		System.out.println(s);
		
		Iterator<String> it = li.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
