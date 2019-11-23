/*
A B C D E 
  A B C D 
    A B C 
      A B 
        A 
 */
package pattern;
import java.util.Scanner;
public class Pattern37 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range.");
		int n=sc.nextInt();
		for (int i = 0; i <n; i++) 
		{
			for (int j = 1; j <=i; j++)
			{
				System.out.print("  ");
			}
			for (int j = 1; j <=n-i; j++) 
			{
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
			sc.close();
		}
	}
}
