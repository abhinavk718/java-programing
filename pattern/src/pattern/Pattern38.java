/*
1 0 1 0 1 
  1 0 1 0 
    1 0 1 
      1 0 
        1 
 */
package pattern;
import java.util.Scanner;
public class Pattern38 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range.");
		int n=sc.nextInt();
		for (int i = 1; i <=n; i++) 
		{
			for (int j =1; j <i; j++)
			{
				System.out.print("  ");
			}
			int k=1;
			for (int j = 0; j <=n-i; j++) 
			{
				System.out.print(k%2+" ");
				k++;
			}
			System.out.println();
		}
	}
}
