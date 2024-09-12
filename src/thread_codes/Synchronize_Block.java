package thread_codes;

class counter
{
	private int count=0;
	public synchronized void increment()
	{
		count++;
	}
	public int getcount()
	{
		return count;
	}
}
public class Synchronize_Block {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		counter cnt = new counter();
		Thread th = new Thread(()->
		{
			for(int i=1;i<1000;i++)
			{
				cnt.increment();
			}
		});
		Thread th1 = new Thread(()->
		{
			for(int i=1;i<1000;i++)
			{
				cnt.increment();
			}
		});
		th.start();
		th.join();
		th1.start();
		
		System.out.println(cnt.getcount());
	}

}
