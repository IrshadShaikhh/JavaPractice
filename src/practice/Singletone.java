package practice;

public class Singletone {

	private static final Singletone instance = new Singletone();
	
	private Singletone()
	{
		System.out.println("singletone instance created");
	}
	public static Singletone getInstance()
	{
		return instance;
	}
	public void message()
	{
		System.out.println("display meessage");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singletone singletone1 = Singletone.getInstance();
		Singletone singletone2 = Singletone.getInstance();
		
		singletone1.message();
		
		
		System.out.println(singletone1==singletone2);
	}

}


