public class Farmer 
{
     public static void main(String[] args) 
     {
    	 Grass g=new Grass();
    	 Cow c=new Cow();
    	 System.out.println("Farmers feeds grass to cow.");
    	Milk m =c.gives(g);
     }
}
