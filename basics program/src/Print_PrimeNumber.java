import java.util.Scanner;
public class Print_PrimeNumber 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range.");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++)
		{	
		   if(isEven(i))
		   {
			System.out.println(i);
		   }
		}
		sc.close();
	}
	public static boolean isEven(int x)
	{
		if (x % 2 == 0)
			return true;
		else
			return false;
	}  
}
