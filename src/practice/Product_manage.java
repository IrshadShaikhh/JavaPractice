package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Productt implements Comparable<Productt>
{

	int prod_id;
	String prod_name;
	int prod_price;
	
	
	public Productt(int prod_id, String prod_name, int prod_price) {
		super();
		this.prod_id = prod_id;
		this.prod_name = prod_name;
		this.prod_price = prod_price;
	}


	@Override
	public String toString() {
		return "prod_id=" + prod_id + ", prod_name=" + prod_name + ", prod_price=" + prod_price + "";
	}


      //for integer 
//	@Override
//	public int compareTo(Productt o) {
//		return this.prod_name.compareTo(o.prod_name);
//	}
	
	//for string
	@Override
	public int compareTo(Productt o) {
		if(this.prod_name.equals(o.prod_name))
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
}
public class Product_manage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Productt> li = new ArrayList<Productt>();
		li.add(new Productt(10,"abc",2000));
		li.add(new Productt(1,"xyz",2000));
		li.add(new Productt(9,"pew",3000));
		li.add(new Productt(3,"pqr",4000));
		
		Collections.sort(li);
		
		for(Productt p :li)
		{
			System.out.println(p);
		}
	}

}
