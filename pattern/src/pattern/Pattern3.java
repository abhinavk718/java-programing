/*
* * * * * 
* * * * 
* * * 
* * 
* 
 */
package pattern;
import java.util.Scanner;
public class Pattern3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range.");
		int n=sc.nextInt();
		for(int i=n;i>0;i--)
		{
			for (int j=1; j<=i;j++) 
			{
				System.out.print("*"+" ");
			}
			System.out.println();
			sc.close();
		}
	}
}
