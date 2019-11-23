import java.util.Scanner;
public class Sum_PlaindromeNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many elements you have to store in first array.");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Plz enter "+n+" element.");
		for (int i = 0; i <n; i++)
		{
			ar[i]=sc.nextInt();
		}
		sc.close();
		int res=plaindromeSum(ar);
		System.out.println("Sum pf plaindrome number is : "+res);
	}
	static boolean isPlaindrome(int x)
	{
		int t=x,rev=0;
		while(x>0)
		{
			int r=x%10;
			rev=rev*10+r;
			x=x/10;
		}
		if(t==rev)
			return true;
		else 
			return false;
	}
	static int plaindromeSum(int []x)
	{
		int sum=0;
		for (int i = 0; i < x.length; i++) 
		{
			if(isPlaindrome(x[i]))
				sum=sum+x[i];
		}
		return sum;
	}
}
