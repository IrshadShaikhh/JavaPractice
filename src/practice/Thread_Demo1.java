package practice;

class Thread3 extends Thread
{
	public void run()
	{
		try
		{
			System.out.println(Thread.currentThread().getId()+" runnning");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
public class Thread_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=8;
		for(int i=0;i<n;i++)
		{
			Thread3 obj = new Thread3();
			obj.start();
		}
	}

}
