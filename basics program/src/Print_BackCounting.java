import java.util.Scanner;
public class Print_BackCounting
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range ");
		int n=sc.nextInt();
		while(n>=1)
		{
			System.out.println(n);
			n--;
		}
		sc.close();
	}
}
