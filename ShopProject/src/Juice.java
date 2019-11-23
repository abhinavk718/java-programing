public class Juice 
{
	public static void main(String[] args) 
	{
		System.out.println("Main start.");
		Lemon l=new Lemon();
		Sugarcane s=new Sugarcane();
		Ginger g=new Ginger();
		Shop sp=new Shop();
		sp.serve(s,l,g);
		System.out.println("Main ends.");
	}
}
