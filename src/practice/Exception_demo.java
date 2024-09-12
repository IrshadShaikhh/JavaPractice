package practice;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int a=10;
		int b=0;
		try
		{
			System.out.println(a/b);
		}
		catch(Exception e)
		{
			System.out.println("can not divide by 0");
			System.out.println(e.toString());
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		*/
		
		/*
		try
		{
			String str=null;
			System.out.println(str.charAt(4));
		}
		catch(NullPointerException np)
		{
			System.out.println(" there is null pointer");
		   np.printStackTrace();
		}
		*/
		
		/*
		try
		{
		String str ="hello";
		char c = str.charAt(12);
		System.out.println(c);
		}
		catch (StringIndexOutOfBoundsException s) {
			System.out.println("out of bond");
		}
		*/
		
		/*
		try
		{
			int num=Integer.parseInt("hello");
			System.out.println(num);
		}
		catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("number formaar exception");
			e.printStackTrace();
		}
		*/
		
		
		/*
		try
		{
			int a[] =new int[10];
			System.out.println(a[11]);
		}
		catch (ArrayIndexOutOfBoundsException  e) {
			// TODO: handle exception
			System.out.println("array index out bond exception");
		}
		*/
		
		/*
		try
		{
			Class.forName("Access_modifier");
		}
		catch(ClassNotFoundException c)
		{
			System.out.println("Class not found exception");
			c.printStackTrace();
		}
		*/
		
		Scanner sc = new Scanner(System.in);
		try
		{
		System.out.println("enter integer no");
		 int no =sc.nextInt();
		 int result =100/no;
		 System.out.println("Result "+result );
		}
		catch (ArithmeticException a) {
			a.printStackTrace();
		}
		catch (InputMismatchException i) {
			i.printStackTrace();
		}
		finally {
			sc.close();
		}
		
	}

}
