import java.util.Scanner;
public class Series2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		int n=sc.nextInt();
		int i=1;
		while(i<=n)
		{
			int res=power(i,i);
			System.out.print(res+" ");
            i++;
		}
		sc.close();
	}
	public static int power(int x,int y)
	{
		int pow=1;
		while(y>=1)
		{
		pow=pow*x;
		y--;
		}
		return pow;
	}
}
