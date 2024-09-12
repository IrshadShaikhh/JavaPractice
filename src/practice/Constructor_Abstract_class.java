package practice;

abstract class Animal

{
	private String name;
	public Animal(String name)
	{
		this.name=name;
		System.out.println("my dog name is "+name);
	}
	abstract void sound();
	
	public String getName()
	{
		return name;
	}
}
class Dog extends Animal
{
	public Dog(String name)
	{
		super(name);
		System.out.println("dog  constructor called");
	}

	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("bark");
	}
}
public class Constructor_Abstract_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog ob =new Dog("Bob");
		ob.sound();
		System.out.println(ob.getName());
		
	}

}
