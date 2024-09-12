package practice;

class Area
{
	 static double radius;
	public static double print(double radius)
	{
		return Math.PI* radius*radius;
		
	}
}
public class Static_method_variable {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Area.print(5));
	}

}
