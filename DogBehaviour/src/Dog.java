public class Dog 
{
	String type="kantri";
	String clr="black";
	int age=5;
	void bark()
	{
		System.out.println("Dogs barks");
	}
	void bite()
	{
		System.out.println("Dogs bite");
	}
	public static void main(String[] args) 
	{
		Dog d1=new Dog();
		d1.bark();
		d1.bite();
		Dog d2=new Dog();
		d2.bark();
		d2.bite();
		System.out.println(d1.type);
		System.out.println(d2.clr);
		System.out.println(d1.age);
		
		
	}

}
