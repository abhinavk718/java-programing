/*
101010101
 1010101
  10101
   101
    1
 */
package pattern;
import java.util.Scanner;
public class Pattern27
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range.");
		int n=sc.nextInt();
		for (int i = n; i>=1; i--) 
		{
			for (int j =0;j<n-i; j++) 
			{
				System.out.print(" ");
			}
			for (int j =1; j <=i*2-1; j++)
			{
				System.out.print(j%2);
			}
			System.out.println();
		}
	}
}
