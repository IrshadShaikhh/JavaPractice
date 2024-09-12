package practice;

interface Multi1 
{
	void disp1();
}
interface Multi2
{
	void disp2();
}
class Main_class implements Multi1,Multi2
{
	public void disp1()
	{
		System.out.println("method 1");
	}
	public void disp2()
	{
		System.out.println("method 2");
	}
}

public class Multiple_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main_class ob = new Main_class();
		ob.disp1();
		ob.disp2();
	}

}
