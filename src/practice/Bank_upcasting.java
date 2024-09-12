package practice;

class Bank
{
	public float getRateofInterest()
	{
		return 0;
	}
}
class SBI extends Bank
{
	public float getRateofInterest()
	{
		return 4.5f;
	}
}
class ICICI extends Bank
{
	public float getRateofInterest()
	{
		return 5.4f;
	}
}
class AXIS extends Bank
{
	public float getRateofInterest()
	{
		return 8.4f;
	}
}
public class Bank_upcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new SBI();
		System.out.println("SBI rate of interest "+b.getRateofInterest());
		Bank b1 = new ICICI();
		System.out.println("ICICI rate of interest "+b1.getRateofInterest());
		Bank b2 = new AXIS();
		System.out.println("AXIS rate of interest "+b2.getRateofInterest());
	}

}
