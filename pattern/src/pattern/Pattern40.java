/*
        1 
      2 3 4 
    5 6 7 8 9 
  1 2 3 4 5 6 7 
8 9 1 2 3 4 5 6 7 

 */
package pattern;
import java.util.Scanner;
public class Pattern40 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range.");
		int n=sc.nextInt();
		int k=0;
		for (int i = 1; i <=n; i++)
		{
			for (int j =1; j <=n-i; j++)
			{
				System.out.print("  ");
			}
			for (int j =1; j <=2*i-1; j++) 
			{
			  System.out.print(k+1+" ");
			  k++;
			  if(k==9)
			  {
				k=0;
			  }
			}
			System.out.println();
			sc.close();
		}
	}
}
