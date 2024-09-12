package practice;

class Thread_1 implements Runnable
{
	public void run()
	{
		System.out.println("Thread is running");
		try
		{
			Thread.sleep(500);
		}
		catch (InterruptedException e) {
			System.out.println("Interrupt excepiton");
		}
		System.out.println("Thread finish execution");
	}
}
public class Thread_state {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread_1 runnable = new Thread_1();
		
		Thread th = new Thread(runnable);
		
		System.out.println("Thread state after creation "+th.getState());
		
		th.start();
		
		System.out.println("Thread state after start "+th.getState());
		
		while(th.isAlive())
		{
			System.out.println("Thread state when alive "+th.getState());
		
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException i)
			{
				System.out.println(i);
			}
		}
		System.out.println("Thread state after compltion "+th.getState());
	}

}
