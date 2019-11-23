/*
        A 
      A B C 
    A B C D E 
  A B C D E F G 
A B C D E F G H I 

 */
package pattern;
import java.util.Scanner;
public class Pattern30
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int n=sc.nextInt();
		for (int i = 1; i <=n; i++) 
		{
			for (int j = 1; j<=n-i; j++) 
			{
				System.out.print("  ");
			}
			for (int j2 =1; j2 <=2*i-1; j2++) 
			{
				System.out.print((char)(j2+64)+" ");
			}
			System.out.println();
		}
	}
}
