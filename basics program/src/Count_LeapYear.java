import java.util.Scanner;
public class Count_LeapYear 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year.");
		int n=sc.nextInt();
		int count=0;
		for (int i = 1; i <=n; i++) 
		{
			if(i%400==0||i%4==0&&i%100!=0)
				count++;
		}
		System.out.println(count+" leap year upto "+n);
		sc.close();
	}
}

