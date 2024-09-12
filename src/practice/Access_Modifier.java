package practice;

class Access_modi
{
	private int a=10;
	public int b=10;
	protected int c=10;
	
	void disp()
	{
		System.out.println("private access modifier");
	}
}
public class Access_Modifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access_modi ob = new Access_modi();
		ob.disp();
		//  System.out.println(ob.a);   not access private show error
		System.out.println(ob.b);
		System.out.println(ob.c);
	}

}
