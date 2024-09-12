package thread_codes;

class printtest extends Thread
{
	public synchronized void print(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread is working...");
			try
			{
				Thread.sleep(1000);
			}
			catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		System.out.println("-------------------------------");
		try
		{
			Thread.sleep(1000);
		}
		catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
class Thread5 extends Thread
{
	printtest test;
	public Thread5(printtest p)
	{
		test=p;
	}
	public void run()
	{
		test.print(1);
		
	}
}
class Thread6 extends Thread
{
	printtest test;
	public Thread6(printtest p)
	{
		test=p;
	}
	public void run()
	{
		test.print(2);
		
	}
}
public class Synchronize_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printtest p = new printtest();
		
		Thread5 th1 = new Thread5(p);
		Thread6 th2 = new Thread6(p);
		
		
		th1.start();
		th2.start();
		
	}

}
