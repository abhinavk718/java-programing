/*
1
21
321
4321
54321
 */
package pattern;
import java.util.Scanner;
public class Pattern14 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range.");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++) 
		{
			for (int j=i;j>0;j--) 
			{
				System.out.print(j);
			}
			System.out.println();
			sc.close();
		}
	}
}
