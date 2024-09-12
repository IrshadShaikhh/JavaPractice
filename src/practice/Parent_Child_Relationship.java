package practice;

class Parent2
{
	public void show()
	{
		System.out.println("Parent class mtehod");
	}
}
class Childd2 extends Parent2
{
	public void show()
	{
		System.out.println("child class method");
	}
	public void childshow()
	{
		System.out.println("method specific to child class");
	}
}
public class Parent_Child_Relationship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent2 obj1 = new Parent2();
		Parent2 obj2 = new Childd2();
		
		disp(obj1);
		disp(obj2);
		
		
	}
	static void disp(Parent2 pobj)
	{
		if(pobj instanceof Childd2) {
			Childd2 c = (Childd2)(pobj);
			c.childshow();
		}
		else
		{
			System.out.println("Pobj is not instance of class");
		}
	}

}
