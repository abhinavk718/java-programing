import java.util.Scanner;
public class ProductNatural_Number
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range.");
		int n=sc.nextInt();
		int product=1,t=n;
		while(n>=1)
		{
			product=product*n;
			n--;
		}
		System.out.println("product of first "+t+" natural number is "+product);
		sc.close();
	}
}
