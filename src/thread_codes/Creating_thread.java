package thread_codes;


/*  By Extending Class
 
class MyThread extends Thread
{
	public void run()
	{
		System.out.println("My thread Thread class");
	}
}

*/

class MyThread implements Runnable
{

	@Override
	public void run() {
		System.out.println("Running my thread runnable interface");
		
	}
	
}
public class Creating_thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread th1 = new Thread(new MyThread());
		th1.start();
	}

}
