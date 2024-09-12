package practice;

class Base
{
	int id;
	String name;
	public Base(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public void disp()
	{
		System.out.println(id);
		System.out.println(name);
	}
}
class Derived extends Base
{
	String  city;
	public Derived(int id,String name,String city)
	{
		super(id,name);
		this.city=city;
	}
	public void disp1()
	{
		System.out.println(city);
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived d = new Derived(1,"irshad","pune");
		d.disp();
		d.disp1();
	}

}
