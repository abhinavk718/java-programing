/*
1 
2 3 
3 4 5 
4 5 6 7 
5 6 7 8 9 
 */
package pattern;
import java.util.Scanner;
public class Pattern32
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
				System.out.print(i+j+" ");
			}
			System.out.println();
		}
	}
}
