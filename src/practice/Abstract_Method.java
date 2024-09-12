package practice;

interface Demo5
{
	void start();
	default void stop()
	{
		System.out.println("stop");
	}
	default void end()
	{
		System.out.println("end");
	}
}
class Car implements Demo5
{
	@Override
	public void start()
	{
		System.out.println("Start");
	}
}


public class Abstract_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car ob = new Car();
		ob.start();
		ob.stop();
		ob.end();
	}

}
