import java.util.Scanner;
public class Count_DivisibleBy_3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range.");
		int n=sc.nextInt();
		int count=0;
		for (int i =1; i <=n; i++)
		{
			if(i%3==0)
				count++;
		}
		System.out.println(count+" number are divisible by 3 out of "+n);
	}
}
