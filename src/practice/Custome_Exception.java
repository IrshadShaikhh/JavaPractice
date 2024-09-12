package practice;

import java.util.Scanner;

class InvalidAgeException extends Exception
{
	 InvalidAgeException(String msg) {
		super(msg);
	}
}
public class Custome_Exception {
	Scanner sc = new Scanner(System.in);
	public void disp()
	{
		System.out.println("Enter age");
		int age=sc.nextInt();
		try
		{
			if(age<20)
			{
				throw new InvalidAgeException("Age is invalidd ");
			}
			else 
			{
				System.out.println("Age is valid");
			}
		}
		catch(InvalidAgeException i)
		{
			System.out.println(i.getMessage());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Custome_Exception obj = new Custome_Exception();
		obj.disp();
	}

}
