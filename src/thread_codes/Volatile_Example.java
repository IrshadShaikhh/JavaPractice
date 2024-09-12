package thread_codes;

class VolatileExample extends Thread
{
	private volatile boolean running =true;
	public void run()
	{
		while(running)
		{
			System.out.println("Thread running..");
		}
	}
	public void stopRunning()
	{
		running=false;
	}
}
public class Volatile_Example {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		VolatileExample ob = new VolatileExample();
		ob.start();
		
		Thread.sleep(1000);
		ob.stopRunning();
	}

}
