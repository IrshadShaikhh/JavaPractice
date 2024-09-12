package practice;

class Parentt
{
	public void disp1()
	{
		System.out.println("parent class");
	}
}
class Childd extends Parentt
{
	public void disp1()
	{
		System.out.println("child class");
	}
}
public class Upcasting_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parentt p = new Childd();
		p.disp1();
	}

}
