package practice;


public class Constructor_overloading {
	int id;
	String name;
	String address;
	Constructor_overloading()
	{
		System.out.println("Default constrtor");
	}
	public Constructor_overloading(int id)
	{
		this.id=0;
	}
	public Constructor_overloading(int id,String name)
	{
		this.id=id;
		this.name="shaikh";
	}
	public Constructor_overloading(int id,String name,String address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	public void display()
	{
		System.out.println("id : "+id);
		System.out.println("name : "+name);
		System.out.println("address : "+address);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor_overloading o = new Constructor_overloading();
      Constructor_overloading ob = new Constructor_overloading(1);
      ob.display();
      System.out.println();
      Constructor_overloading ob2 = new Constructor_overloading(1,"irshad");
      ob2.display();
      System.out.println();
      Constructor_overloading ob3 = new Constructor_overloading(1,"irshad","pune");
      ob3.display();
	}

}
