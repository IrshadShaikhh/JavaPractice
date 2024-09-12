package practice;

public class Method_overloading {

	public static double calculatearea(double radius)
	{
		return Math.PI*radius*radius;
	}
	public static double calculatearea(double width,double height)
	{
		return width*height;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_overloading ob = new Method_overloading();
		System.out.println(ob.calculatearea(4));
		System.out.println(ob.calculatearea(4, 5));
	}

}
