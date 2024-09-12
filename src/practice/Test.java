package practice;

class Calculator
{
	public int sum(int a,int b)
	{
		return a+b;
	}
	public int sub(int a,int b)
	{
		return a-b;
	}
	public int mul(int a,int b)
	{
		return a*b;
	}
	public int div(int a,int b)
	{
		if(b!=0)
		{
			return a/b;
		}
		else
		{
			System.out.println("division by 0 not allowes");
			return 0;
		}
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=20;
		int num2=10;
		
		Calculator c = new Calculator();
		int add=c.sum(num1, num2);
		int min=c.sub(num1, num2);
		int multi=c.mul(num1, num2);
		int divide = c.div(num1, num2);
		
		System.out.println("addition is "+add);
		System.out.println("substration is "+min);
		System.out.println("multipli "+multi);
		System.out.println("divide "+divide);
		
	}

}
