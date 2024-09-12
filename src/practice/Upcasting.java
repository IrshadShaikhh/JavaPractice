package practice;

class Base1
{
	public void disp()
	{
		System.out.println("print A method");
	}
}
class Derived1 extends Base1
{
	public void disp()
	{
		System.out.println("Print b method");
	}
}
public class Upcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ob is the reference variable of Base1 class and object is created type of Derived1
		Base1 ob = new Derived1();
		ob.disp();
	}

}
