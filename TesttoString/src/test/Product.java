package test;
public class Product 
{
	int id;
	String name;
	double price;
	public Product(int id)
	{
		this.id=id;
	}
	public Product(String name,double price)
	{
		this.name=name;
		this.price=price;
	}
	@Override
	public String toString()
	{
		return this.name+"="+this.price+"Rs";		
	}
	public static void main(String[] args) 
	{
		Product p1=new Product("soap",40);
		Product p2=new Product("shampoo",240);
		System.out.println(p1);
		System.out.println(p2);
	}


}
