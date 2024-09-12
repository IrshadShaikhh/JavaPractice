package practice;

import java.util.HashMap;
import java.util.Map;

public class Map_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<Integer, String>(3);
		hm.put(1, "irshad");
		hm.put(2, "shaikh");
		hm.put(3, "prasad");
		hm.put(4, "kumbhar");
		hm.put(4, "aditya");
		System.out.println(hm);
		
		for(Map.Entry<Integer, String> mp : hm.entrySet())
		{
			System.out.println(mp.getKey()+" "+mp.getValue());
		}
	}

}
