package practice;

public class Static_block {

	public static void disp(int id,String name)
	{
		System.out.println("id "+id);
		System.out.println("name "+name);
	}
	static
	{
		System.out.println("static block invoked");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main mehod invoked");
		Static_block.disp(1, "irshad");
	}

}
