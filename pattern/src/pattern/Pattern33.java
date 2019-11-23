/*
A 
B C 
C D E 
D E F G 
E F G H I 

 */
package pattern;
import java.util.Scanner;
public class Pattern33
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range.");
		int n=sc.nextInt();
		for (int i =1; i <=n; i++) 
		{
			for (int j = 0; j <i; j++) 
			{
				System.out.print((char)(i+j+64)+" ");
			}
			System.out.println();
		}
	}
}
