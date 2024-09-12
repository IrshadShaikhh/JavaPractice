package thread_codes;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable
{
	private String name;
	private int age;
	private String city;
	public Person(String name,int age,String city)
	{
		this.name=name;
		this.age=age;
		this.city=city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
public class SerializableEx {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Person person = new Person("irshad",25,"satara");
		
		FileOutputStream fos = new FileOutputStream("C:/Users/Nimap/Desktop/demo.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(person);
		
		oos.close();
		fos.close();
		
		System.out.println("Object state is transter to the demo.txt");
	}

}
