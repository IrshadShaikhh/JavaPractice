package practice;

public class Garbage_Collection_check {

	public void finalize()
	{
		System.out.println("Garbage collection called");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Garbage_Collection_check ob = new Garbage_Collection_check();
		Garbage_Collection_check ob1 = new Garbage_Collection_check();
		ob=null;
		ob1=null;
		System.gc();
	}

}
