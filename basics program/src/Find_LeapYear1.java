import java.util.Scanner;
public class Find_LeapYear1 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year.");
		int n=sc.nextInt();
		int noOfYear=n/4+n/400-n/100;
		System.out.println(noOfYear+" leap year upto "+n);
		sc.close();
	}
}


