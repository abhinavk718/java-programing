package pattern;
import java.util.Scanner;
public class Pattern49
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the range.");
		int n=sc.nextInt();
		for (int i = 1; i <=n; i++)
		{
			int k=1;
			for (int j = 1; j <=2*i-1; j++) 
			{
				if(j%2==0)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(k+" ");
					k++;
				}
			}
			System.out.println();
		}
	}
}
