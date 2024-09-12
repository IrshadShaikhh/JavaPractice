package practice;

public class Emp {

	int id;
	String name;
	Address address;
	public Emp(int id,String name,Address address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void display()
	{
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address1 = new Address("pune","maharastra","india");
		Address address2 = new Address("mumbai","maharastra","india");
		
		Emp emp1 = new Emp(1,"irshad",address1);
		Emp emp2 = new Emp(2,"shaikh",address2);
		
		
	}

}
