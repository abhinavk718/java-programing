import java.util.Scanner;
public class CountDisplayDivisors 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		int n=sc.nextInt();
		int count=0,i=1;
		System.out.println("Divisors of "+n+" is :");
		while(i<=n)
		{
			if(n%i==0)
			{
				count++;
				System.out.println(i);
			}
			i++;
		}
		System.out.println("total number of divisors of "+n+" is "+count);
		sc.close();
	}
}
