package practice;

class Const_overload
{
	String name;
	int a;
	int age;
	public Const_overload(int a,String name,int age)
	{
		this.name=name;
		this.a=a;
		this.age=age;;
	}
	public Const_overload(int a)
	{
		this.a=a;
		this.name="unknown";
		this.age=0;
	}
	public Const_overload(int a,String name)
	{
		this.name=name;
		this.a=a;
		this.age=0;
	}
	public void disp()
	{
		System.out.println(a+" "+name+" "+age);
	}

}
public class Constructor_Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Const_overload ob = new Const_overload(1);
		Const_overload ob1 = new Const_overload(1, "Abc");
		Const_overload ob2 = new Const_overload(1, "Abc",23);
		ob.disp();
		ob1.disp();
		ob2.disp();
	}

}
