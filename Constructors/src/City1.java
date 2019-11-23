public class City1 
{
	String name;
	int pincode;
	 public City1(String name,int pincode)
	 {
		 super();
		 this.name=name;
		 this.pincode=pincode; 
	 }
	 public City1(String name)
	 {
		 super();
		 this.name=name;
	 }
	 public static void main(String[] args) 
	 {
		City1 c1=new City1("Bhopal",851215);
		System.out.println("city name ->"+c1.name);
		System.out.println("pincode ->"+c1.pincode);
		City1 c2=new City1("Delhi");
		System.out.println("city name ->"+c2.name);
	 }

}
