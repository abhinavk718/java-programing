import java.util.Scanner;
public class CalculateOddProduct 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz enter the range.");
		int n=sc.nextInt();
		int product=1;
		for (int i = 1; i <=n; i++)
		{
			if(isOdd(i))
		    product=product*i;	
		}
		System.out.println("Product of odd number is "+product);
		sc.close();
	}
	public static boolean isOdd(int x)
	{
		if(x%2!=0)
			return true;
		return false;
	}
}
