package practice;

class poly1 
{
	public void disp()
	{
		System.out.println("method 1");
		
	}
	
}
class poly2 extends poly1
{
	public void disp()
	{
		System.out.println("method 2");
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		poly2 ob = new poly2();
		ob.disp();
	}

}
