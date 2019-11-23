public class Shop
{
	String name="cane-o-la";
	Juice serve(Sugarcane s,Lemon l,Ginger g)
	{
		Juice j=new Juice();
		System.out.println(name+", gives sugarcane juice.");
		return j;
	}

}
