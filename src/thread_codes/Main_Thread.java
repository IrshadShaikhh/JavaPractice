package thread_codes;

class Child_Thread extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
		System.out.println("Chile thread");
		}
	}
}
public class Main_Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread th =Thread.currentThread();
		System.out.println("Current Thread : "+ th.getName());
		System.out.println("Current threas priority : "+th.getPriority());
		th.setName("Main Thread");
		th.setPriority(10);;
		System.out.println("after changing name Current Thread : "+ th.getName());
		System.out.println("afer changing name Current threas priority : "+th.getPriority());
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("main thread ");
		}
		
		Thread ct = new Thread();
		System.out.println("child thread priority "+ct.getPriority());
		ct.setPriority(1);
		System.out.println("new child thread priority "+ct.getPriority());
		for(int i=1;i<=5;i++)
		{
			System.out.println("Child thread");
		}
		
		
		
		ct.start();
		
	}

}
