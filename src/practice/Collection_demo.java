package practice;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class Collection_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li1 = new ArrayList<Integer>();
		li1.add(10);
		li1.add(20);
		li1.add(30);
		for(Integer a : li1)
		{
			System.out.println(a);
		}
			
		
		Vector<Integer> li = new Vector<Integer>();
		 for(int i=1;i<=5;i++)
			 
		 {
			 li.add(i);
		 }
		 System.out.println(li);
		 li.remove(2);
		 
		 for(int i=0;i<li.size();i++)
		 {
			 System.out.println(li.get(i));
		 }
		 
		 
		 
		 
		 
		 ArrayDeque<Integer> de = new ArrayDeque<Integer>();
		 
		 de.add(10);
		 de.add(20);
		 de.add(30);
		 
		 System.out.println(de);
		 for(int i=1;i<=4;i++)
		 {
			 de.add(i);
		 }
		 System.out.println(de);
		 
		 de.addFirst(1);
		 de.addLast(10);
		 System.out.println(de);
		 
		 de.removeLast();
		 de.removeFirst();
		 System.out.println(de);
		 
		 
		 
		 
		 Set<Integer>  se = new HashSet<Integer>();
		 se.add(10);
		 se.add(20);
		 se.add(30);
		 se.add(10);
		 System.out.println(se);
		 
		 Iterator<Integer> it = se.iterator();
		 while(it.hasNext())
		 {
			 System.out.println(it.next());
		 }
	 
		
		 Map<Integer, String> mp = new HashMap<Integer, String>();
		 mp.put(1, "abc");
		 mp.put(2, "xyz");
		 mp.put(3, "pqr");
		 mp.put(4, "spa");
		 
		 System.out.println("value for 1 is "+mp.get(1));
		 
		 for(Map.Entry<Integer, String> e : mp.entrySet())
		 {
			 System.out.println(e.getKey()+" "+e.getValue());
		 }
	}  

}
