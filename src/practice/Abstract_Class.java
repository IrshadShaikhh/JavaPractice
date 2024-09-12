package practice;


abstract class Shape
{
	public abstract double calculatearea();
}
class Circle extends Shape
{
    private double radius;
    Circle(double radius)
    {
    	this.radius=radius;
    }

	@Override
	public double calculatearea() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}	
}
class Rectangle extends Shape
{
	private double length,width;
    Rectangle(double length,double width)
    {
    	this.length=length;
    	this.width=width;
    }

	@Override
	public double calculatearea() {
		// TODO Auto-generated method stub
		return length*width;
	}

	
}
public class Abstract_Class {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(4);
		System.out.println(c.calculatearea());
		Rectangle r =new Rectangle(4,5);
		System.out.println(r.calculatearea());
		
	}

}
