package practice;


public class Main_Thread_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread th = new Thread();
		System.out.println("current thread name "+th.currentThread().getName());
		System.out.println("Current thread priority "+th.currentThread().getPriority());
		
		th.currentThread().setPriority(2);
		th.currentThread().setName("Main_Thread");
		
		System.out.println("after changng current thread name "+th.currentThread().getName());
		System.out.println("after changing 	Current thread priority "+th.currentThread().getPriority());
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Main thread ");
		}
		
		Thread ct = new Thread();
		System.out.println("child thread priority "+ct.getPriority());
		ct.setPriority(9);
		System.out.println("child thread new priority "+ct.getPriority());
	}

}
class Child_thread extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Child thread");
		}
	}
}
