import java.util.Scanner;
public class Display_Divisors 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		int n=sc.nextInt();
		System.out.println("Divisors of "+n+" is :");
		int i=1;
		while(i<=n)
		{
			if(n%i==0)
				System.out.println(i);
			i++;
		}
		sc.close();
	}
}
