package practice;

class Thread_demoo extends Thread
{
	public void run()
	{
		System.out.println("Thread in running");
	}
}
public class Thread_priorityy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread_demoo th1 = new Thread_demoo();
		Thread_demoo th2 = new Thread_demoo();
		Thread_demoo th3 = new Thread_demoo();
		
		System.out.println("thread 1 priority "+th1.getPriority());
		System.out.println("thread 3 priority "+th2.getPriority());
		System.out.println("thread 4 priority "+th3.getPriority());
		
		th1.setPriority(7);
		th2.setPriority(9);
		th3.setPriority(2);
		
		System.out.println("thread 1 priority "+th1.getPriority());
		System.out.println("thread 3 priority "+th2.getPriority());
		System.out.println("thread 4 priority "+th3.getPriority());
		
		
		System.out.println("Currently running thread "+Thread.currentThread().getName());
		System.out.println("current thread "+Thread.currentThread().getPriority());
		
		Thread.currentThread().setPriority(3);
		System.out.println("After changing prioriy "+Thread.currentThread().getPriority());
	}

}
