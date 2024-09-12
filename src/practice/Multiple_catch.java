package practice;


public class Multiple_catch {

	public void display()
	{
		try
		{
			try
			{
				int a[]=new int[10];
				System.out.println(a[12]);
			}
			catch (ArrayIndexOutOfBoundsException a) {
				System.out.println(a.toString());
			}
			
			try {
				int a=10;
				int b=0;
				System.out.println(a/b);
			}
			catch(ArithmeticException a)
			{
				System.out.println(a.toString());
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiple_catch obj = new Multiple_catch();
		obj.display();
	}

}
