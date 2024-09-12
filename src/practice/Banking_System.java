package practice;

import java.util.Scanner;

class InsuffieientfundException extends Exception
{
	InsuffieientfundException(String msg) {
		super(msg);
	}
}
public class Banking_System {

//	public void transaction(double bal)
//	{
//		try
//		{
//			if(bal<1000)
//			{
//				throw new InsuffieientfundException("Low balance");
//			}
//			else 
//			{
//				System.out.println("Sufficient balance");
//			}
//		}
//		catch(InsuffieientfundException e)
//		{
//			System.out.println(e.getMessage());
//		}
//	}
	int total_bal=3000;
	
	Scanner sc = new Scanner(System.in);
	public void withdraw()
	{
		System.out.println("Enter amount to be wiythdraw");
		int withdr=sc.nextInt();
	

		total_bal-=withdr;
		System.out.println("Withdraw successfully done");
		System.out.println("Eurrent balance is : "+total_bal);
	}
	 
	public void deposit()
	{
		System.out.println("Enter amount to be deposit");
		int depo=sc.nextInt();
		try
		{
			if(total_bal<depo)
			{
				throw new InsuffieientfundException("Your balance is low");
			}
			else
			{
				total_bal+=depo;
				System.out.println("Deposit successfully done");
				System.out.println("Eurrent balance is "+total_bal);
			}
		}
		catch(InsuffieientfundException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	public void checkbal()
	{
		System.out.println("Your current balance is "+total_bal);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Banking_System ob = new Banking_System();
//		ob.transaction(1300);
		
		Scanner sc = new Scanner(System.in);
		
		Banking_System obj = new Banking_System();
		
		
		

		boolean op =true;
		while(op)
		{
			System.out.println("1.deposit");
			System.out.println("2.withdraw");
			System.out.println("3.check balance");
			System.out.println("4.exit");
			System.out.println();
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			
		switch(ch)
		{
		case 1:
			obj.deposit();
			break;
		case 2:
			obj.withdraw();
			break;
		case 3:
		    obj.checkbal();
		    break;
		case 4:
		op=false;
		System.out.println("thank you");
		break;
		
		default:
			System.out.println("invalid choice plese select correct choice");
			break;
			
		}
		}
}
}
