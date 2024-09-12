package thread_codes;

class NamingThread extends Thread
{
	NamingThread(String msg)
	{
		super(msg);
	}
	public void run()
	{
		System.out.println("Thread is running");
	}
}
public class Naming_Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NamingThread th1 =new NamingThread("Thread 1");
		NamingThread th2 = new NamingThread("Thread 2");
		
		
		System.out.println("Thread 1 name : "+th1.getName());
		System.out.println("Thread 2 name : "+th2.getName());
		
		th1.start();
		th2.start();
	}

}
