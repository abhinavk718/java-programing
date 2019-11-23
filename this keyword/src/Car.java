public class Car 
{
	String model;
	void drive()
	{
		System.out.println(this.model);
	}
	public static void main(String[] args) 
	{
	   Car c=new Car();
	   c.model="SWIFT";
	   Car c1=new Car();
	   c1.model="INNOVA";
	   c.drive();
	   c1.drive();
	}
}
