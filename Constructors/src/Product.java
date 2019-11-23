public class Product 
{
	double price;
	String type;
	public Product(String type,double price)
	{
		this.type=type;
		this.price=price;
	}
	public Product(String type)
	{
		this.type=type;
	}
	public static void main(String[] args)
	{
		Product p=new Product("kingfisher",500);
		System.out.println("Type -->"+p.type);
		System.out.println("price-->"+p.price);
		Product p1=new Product("kingfisher");
		System.out.println("Type -->"+p1.type);
	}

}
