package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Personn
{
	String name;
	int age;
	
	public Personn(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	@Override
	public String toString() {
		return "name=" + name + ", age=" + age + "";
	}
	
}
public class StreamAPI_Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Personn> P = new ArrayList<Personn>();
		P.add(new Personn("irshad",25));
		P.add(new Personn("shaikh",26));
		P.add(new Personn("prasad",23));
		P.add(new Personn("sagar",17));
		
		int totalage = P.stream().filter(Personn -> Personn.getAge()>18).map(Personn::getAge).reduce(0, Integer::sum);
		System.out.println("age greater than 18 sum "+totalage);
		
		List<Personn> ageless = P.stream().filter(Personn -> Personn.age<18).collect(Collectors.toList());
		System.out.println("age less than 18 "+ageless);
		
		int total  = P.stream().map(Personn :: getAge).reduce(0, Integer::sum);
		System.out.println("total age "+total);
	}

}
