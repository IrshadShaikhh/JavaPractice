package thread_codes;

interface Secured
{
	
}
class User implements Secured
{
	private String name;
	public User(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	@Override
	public String toString() {
		return "User: "+name;
	}
	
}
class Admin implements Secured
{
	private String role;
	public Admin(String role)
	{
		this.role=role;
	}
	public String getRole()
	{
		return role;
	}
	public String toString()
	{
		return "Role: "+role;
	}
}

class Guest
{
	private String name;
	public Guest(String name)
	{
		this.name=name;
	}
	public String getRole()
	{
		return name;
	}
	public String toString()
	{
		return "Guest: "+name;
	}
}
public class MarkerInterface {

	public void ChechAccess(Object object)
	{
		if(object instanceof Secured)
		{
			System.out.println(object+" Access Granted..");
		}
		else
		{
			System.out.println(object+ " Access Denied..");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarkerInterface mark = new MarkerInterface();
		
		User user = new User("Irshad");
		Admin admin = new Admin("Admin");
		Guest guest = new Guest("Guest");
		
		mark.ChechAccess(admin);
		mark.ChechAccess(user);
		mark.ChechAccess(guest);
	}

}

