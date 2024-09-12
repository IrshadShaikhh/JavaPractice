package thread_codes;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeStudent {

	public static void main(String[] args) throws ClassNotFoundException, IOException{
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:/Users/Nimap/Desktop/serial.txt");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Students student = (Students)ois.readObject();
		System.out.println(student.getName());
		System.out.println(student.getId());
		System.out.println(student.getCity());
		
		fis.close();
		ois.close();
		
	}

}
