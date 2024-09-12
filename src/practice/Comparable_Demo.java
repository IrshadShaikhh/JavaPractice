package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>
{
   int roll;
   String name;
   String city;
   public Student(int roll,String name,String city)
   {
	   this.roll=roll;
	   this.name=name;
	   this.city=city;
   }
   
	@Override
	public int compareTo(Student s) {
		if(this.city==s.city)
		{
			return this.roll-s.roll;
		}
		else
		{
			return this.city.compareTo(s.city);
		}
	}

	@Override
	public String toString() {
		return "Student "+roll+" "+name+" "+city;
	}
	
}
public class Comparable_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> li = new ArrayList<Student>();
		li.add(new Student(5,"abc","pune"));
		li.add(new Student(3,"zyz","satare"));
		li.add(new Student(2,"pqr","mumbai"));
		li.add(new Student(1,"pqr","mumbai"));
		
		Collections.sort(li);
		for(Student e:li)
		{
			System.out.println(e);
		}
	}

}
