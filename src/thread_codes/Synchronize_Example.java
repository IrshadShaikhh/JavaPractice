package thread_codes;

class Line
{
	public synchronized void getLine()
	{
		for(int i=1;i<=3;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(400);
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
class Thread7 extends Thread
{
	Line line;
	public Thread7(Line line)
	{
		this.line=line;
	}
	public void run()
	{
		line.getLine();
	}
}
public class Synchronize_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Line obj = new Line();
		
		Thread7 th1 = new Thread7(obj);
		Thread7 th2 = new Thread7(obj);
		
		th1.start();
		th2.start();
	}

}
