package practice;

class Studentt
{
	int id;
	String name;
	static String college="Alard";
	Studentt(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public void display()
	{
		System.out.println(id+" "+name+" "+college);
	}
	public static void disp()
	{
		System.out.println("student details");
	}
}
public class Static_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentt.disp();
		Studentt ob = new Studentt(1,"irshad");
		Studentt ob1 = new Studentt(2,"prasad");
		ob.display();
		ob1.display();
	}

}
