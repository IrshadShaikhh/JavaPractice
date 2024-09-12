package practice;

class Emp1
{
	private int id;
	private String name;
	private String address;
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String na)
	{
		this.name=na;
	}
	public String getName()
	{
		return name;
	}
	public void setAddress(String add)
	{
		this.address=add;
	}
	public String getAddress()
	{
		return address;
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp1 e = new Emp1();
		e.setId(1);
		e.setName("irshad");
		e.setAddress("pune");
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getAddress());
	}

}
