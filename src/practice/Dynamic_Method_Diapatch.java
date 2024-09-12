package practice;

class Parent_Class
{
	public void show()
	{
		System.out.println("Parent class method");
	}
}
class Child_Class extends Parent_Class
{
	public void show()
	{
		System.out.println("Child class Method");
	}
}
public class Dynamic_Method_Diapatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent_Class ob = new Child_Class();
		ob.show();
	}

}
