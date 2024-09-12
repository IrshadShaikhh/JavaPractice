package practice;

interface interface_demo
{
	void print();       //abstract method
	default void print1()    //default method
	{
		System.out.println("method 1");
	}
	default void print2()
	{
		System.out.println("method 2");
	}
}
class class_demo implements interface_demo
{

	@Override
	public void print() {
		System.out.println("print methods 3");
	}
	
}
public class Intercafe_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interface_demo ob = new class_demo();    //upcasting
		ob.print();
		ob.print1();
		ob.print2();
		
		class_demo ob1 = (class_demo) ob;   //downcasting
		ob1.print();
	}

}
