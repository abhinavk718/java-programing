/*
123456789
 1234567
  89123
   456
    7
 */
package pattern;
import java.util.Scanner;
public class Pattern28
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range.");
		int n=sc.nextInt();
		int k=1;
		for (int i =n; i >=1; i--)
		{
			for (int j =1; j <=n-i; j++)
			{
				System.out.print(" ");
			}
			for (int j = 0; j <2*i-1; j++) 
			{
				System.out.print(k);
				if(k==9)
				{
					k=0;
				}
				k++;
			}
			System.out.println();
		}
	}
}