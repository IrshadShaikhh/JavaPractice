package thread_codes;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Students implements Serializable
{
	private int id;
	private String name;
	private String city;
	
	public Students(int id, String name, String city)
	{
		this.id=id;
		this.name=name;
		this.city=city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
}
public class SerializableInterface {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		//creating object ob student class
		Students student = new Students(1,"irshad","satara");
		
		FileOutputStream fos = new FileOutputStream("C:/Users/Nimap/Desktop/serial.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(student);
		
		oos.close();
		fos.close();
		System.out.println("Object state is transfer to serial.txt");
	}

}
