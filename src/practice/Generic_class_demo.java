package practice;

class Box<T>
{
	private T item;
	public Box(T item)
	{
		this.item=item;
	}
	public T getitem()
	{
		return item;
	}
	
}
public class Generic_class_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<String> stringbox = new Box<>("hello");
		Box<Integer> integerbox = new Box<>(123);
		
		System.out.println(stringbox.getitem());
		System.out.println(integerbox.getitem());
	}

}
