package practice;

class Category
{
	int quantity,price,total_price;
	Category(int quantity,int price,int total_price)
	{
		this.quantity=quantity;
		this.price=price;
		this.total_price=total_price;
	}
	
}
public class Product {
	int id;
	String name;
	Category category;
	Product(int id,String name,Category category)
	{
		this.id=id;
		this.name=name;
		this.category=category;
	}
	public void disp()
	{
		System.out.println(id+" "+name);
		System.out.println(category.price+" "+category.quantity+" "+category.total_price);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Category c = new Category(3,200,600);
		Category c1 = new Category(4,100,400);
		
		Product p = new Product(1,"cover",c);
		Product p1 = new Product(2,"glass",c1);
		
		p.disp();
		p1.disp();
	}

}
