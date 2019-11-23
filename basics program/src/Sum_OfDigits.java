import java.util.Scanner;
public class Sum_OfDigits 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		int t=sc.nextInt();
		int sum=0,n=t;
		while(t>0)
		{
			int ld=t%10;
			sum=sum+ld;
			t=t/10;		
		}
		System.out.println("number of digits in "+n+" is "+sum);
		sc.close();
	}
}
