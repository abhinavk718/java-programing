public class TestCity
{
	public static void main(String[] args)
	{
		City c=new City("BHOPAL",462022);
		City c1=new City("BENGALURU",560050);
		City c2=new City("BIHAR",851215);
		System.out.println("City Name-"+c.cityName+","+"Pincode-"+c.Pincode);
		System.out.println("City Name-"+c1.cityName+","+"Pincode-"+c1.Pincode);
		System.out.println("City Name-"+c2.cityName+","+"Pincode-"+c2.Pincode);
	}

}
