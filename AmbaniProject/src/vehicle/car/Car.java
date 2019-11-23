package vehicle.car;
import emp.cook. *;
import emp.driver.*;
public class Car
{
	public static void main(String[] args) 
	{
		CookFood f=new CookFood();
		Car c=new Car();
		Driver d=new Driver();
		f.cook();
		c.start();
		d.drive();
	}
	  public  void start()
	  {
		  System.out.println("Car get started."); 
	  }
}
