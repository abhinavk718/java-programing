import java.util.Scanner;
public class Display_DayName
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the day number.");
		int n=sc.nextInt();
		if(n==1)
			System.out.println("today is monday");
		else if(n==2)
			System.out.println("today is tuesday");
		else if(n==3)
			System.out.println("today is wednesday");
		else if(n==4)
			System.out.println("today is thursday");
		else if(n==5)
			System.out.println("today is friday");
		else if(n==6)
			System.out.println("today is saturday");
		else if(n==7)
			System.out.println("today is sunday");
		else
			System.out.println("Invalid day number");
		sc.close();
		
	}

}
