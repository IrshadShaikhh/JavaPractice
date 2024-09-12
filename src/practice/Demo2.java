package practice;


class person
{
	private int id;
	private String name;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
}
public class Demo2 {

	int a=10;   //stack area
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p =  new person();    //heap area
		p.setId(1);
		
		System.out.println(p.getId()+" "+p.getName());
		
	}

}
