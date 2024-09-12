package practice;

import java.io.IOException;

class Super
{
	public void disp()
	{
		System.out.println("Super class method");
	}
}
class sub extends Super{
	
	/* throws checked exception so compiler gives erroe
	public void disp() throws IOException
	{
		System.out.println("Sub class method");
	}
	*/
	
	// throws unchecked exception so compiler doesnt give error
	public void disp() throws ArithmeticException
	{
		System.out.println("Sub class method");
	}
}
public class Method_overriding_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super obj = new sub();
		obj.disp();
	}

}
