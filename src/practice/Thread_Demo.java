package practice;

class first_thread extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try
			{
			Thread.sleep(500);
			System.out.println(i);
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
class second_thread extends Thread
{
	public void run()
	{
		for(int j=10;j<=20;j++)
		{
			try
			{
				Thread.sleep(700);
			System.out.println(j);
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
public class Thread_Demo {
	public static void main(String[] args) {
		first_thread th1 = new first_thread();
		th1.start();
		second_thread th2 = new second_thread();
		th2.start();
	}
}
