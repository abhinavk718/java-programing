import java.util.Scanner;
public class SumNatural_Number
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range.");
		int n=sc.nextInt();
		int sum=0,t=n;
		while(n>=1)
		{
			sum=sum+n;
			n--;
		}
		System.out.println("sum of first "+t+" natural number is "+sum);
		sc.close();
	}
}
