package thread_codes;

/*   By using thread class

class Thread1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=20;i++)
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
		}
	}
}
 */

   // Implementing runnable interface 

class Thread1 implements Runnable
{
	public void run()
	{
		/*    this is for getting thread name setting name
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Thread no 1");
		System.out.println(Thread.currentThread().getName());
		*/
		
		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}
class Thread2 implements Runnable
{
	public void run()
	{
		for(int i=1;i<=20;i++)
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
		}
	}
}

public class Multi_Thread {
	public static void main(String[] args) {
		/*
		Thread1 th1 = new Thread1();
		th1.start();
		Thread2 th2 = new Thread2();
		th2.start();
		*/
		System.out.println("Main thread priority "+Thread.currentThread().getPriority());
		Thread th1 = new Thread(new Thread1());
		th1.start();
		Thread th2 = new Thread(new Thread2());
		th2.start();
	}
}
