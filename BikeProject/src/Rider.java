public class Rider 
{
	public static void main(String[] args) 
	{ 
		System.out.println("Main start.");
		Bike b=new Bike();
		Petrol p=new Petrol();
		System.out.println("Bike takes petrol.");
		b.start(p);
		System.out.println("Main ends.");
	}

}
