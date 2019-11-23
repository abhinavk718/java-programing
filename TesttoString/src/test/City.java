package test;
public class City
{
	int pincode;
	String name;
	public City()
	{
		this("Bangaluru",560050);
	}
	public City(String name,int pincode)
	{
		this.pincode=pincode;
		this.name=name;
	}
	@Override
	public String toString()
	{
		return this.name+" = "+this.pincode;
		
	}
	public static void main(String[] args) 
	{
		City c=new City();
		City c1=new City("Mysure",542100);
		System.out.println(c);
		System.out.println(c1);
	}
}
