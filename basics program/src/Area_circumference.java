import java.util.Scanner;
public class Area_circumference 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of circle.");
		float r=sc.nextFloat();
		sc.close();
		float area=3.14f*r*r;
		float circumference=2*3.14f*r;
		System.out.println(r+ " radius circle area is "+area);
		System.out.println(r+ " radius circle circumference is "+circumference);
	}
}
