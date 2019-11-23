import java.util.Scanner;
public class Calculate_digitProduct 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		int n=sc.nextInt();
		int product=1,t=n;
		while(n>0)
		{
			int r=n%10;
			product=product*r;
			n=n/10;
		}
		System.out.println("the product of digits of "+t+" is "+product);
		sc.close();
	}
}
