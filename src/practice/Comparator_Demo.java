package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee 
{
   int id;
   String name;
   double salary;
   String dept;
   
   
	public Employee(int id, String name, double salary, String dept) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.dept = dept;
}


	@Override
	public String toString() {
		return "Employee id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "";
	}
	
}
class NameIdComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		int namecompare = o1.name.compareTo(o2.name);
		if(namecompare==0)
		{
			return Integer.compare(o1.id, o2.id);
		}
		return namecompare;
	}
	
}

public class Comparator_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> li = new ArrayList<Employee>();
		li.add(new Employee(12,"aditya",2000,"engg"));
		li.add(new Employee(5,"ryshi",2300,"prod"));
		li.add(new Employee(3,"asalman",1000,"develop"));
		li.add(new Employee(1,"omkar",6000,"engg"));
		
		Collections.sort(li,new NameIdComparator());
		
		for(Employee i :li)
		{
			System.out.println(i);
		}
	}

}
