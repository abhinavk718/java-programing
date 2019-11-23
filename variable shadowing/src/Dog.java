public class Dog 
{
	double ht=6.3;
	void jump()
	{
		double ht=3.7;
		System.out.println(ht);//local variable dominates over instance variable
		//System.out.println(this.ht);
	}
	public static void main(String[] args)
	{
		Dog d=new Dog();
		d.jump();
	}

}
