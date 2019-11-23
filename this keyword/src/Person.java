public class Person 
{
	String name="Guldu";
	void washHands()
	{
		System.out.println("Wash-Hands");
	}
	void eat()
	{
		washHands();
		System.out.println("Eat nice Food.");
		this.washHands();//good practice
		System.out.println(this.name);
	}
	public static void main(String[] args) 
	{
		Person p=new Person();
		p.eat();
		//p.washHands();
	}

}
