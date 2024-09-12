package thread_codes;

class Thread3 extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		for(int i=1;i<=5;i++)
		{
			try
			{
				Thread.sleep(1000);
				System.out.println(i);
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
class Thread4 extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		for(int i=11;i<=15;i++)
		{
			try
			{
				Thread.sleep(1000);
				System.out.println(i);
			}
			catch (Exception e) {
			System.out.println(e);
			}
		}
	}
}
public class Sleep_method {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		Thread3 th1 = new Thread3();
		th1.start();
		th1.join();
		Thread4 th2 = new Thread4();
		th2.start();
	}

}
