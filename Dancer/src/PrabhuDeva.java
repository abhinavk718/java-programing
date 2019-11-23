public class PrabhuDeva 
{
	String Name="Prabhu Deva";
	int Age=55;
	void dance()
	{
		System.out.println("Prabhu deva can dance.");
	}
	public static void main(String[] args)
	{
		PrabhuDeva d1=new PrabhuDeva();
		System.out.println("Name : "+ d1.Name);
		System.out.println("Age : " +d1.Age);
		d1.dance();
				
	}

}
