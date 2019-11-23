import java.util.Scanner;
public class Rectangle_Area_Perimeter 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of rectangle.");
		double l=sc.nextDouble();
		System.out.println("Enter breadth of rectangle.");
		double b=sc.nextDouble();
		double area=l*b;
		double perimeter=2*(l+b);
		System.out.println("Area of rectangle is "+area);
		System.out.println("perimeter of rectangle is "+perimeter);
		sc.close();
	}
}
