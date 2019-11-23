/*
*********
 *******
  *****
   ***
    *
 */
package pattern;
import java.util.Scanner;
public class Pattern10 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range.");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++)
		{
			for (int j=0;j<i-1;j++)
			{
				System.out.print(" ");
			}
			for (int k=0;k<=(n-i)*2;k++) 
			{
				System.out.print("*");
			}
			System.out.println();
			sc.close();
		}
	}
}
