/*
        1 
      0 1 0 
    1 0 1 0 1 
  0 1 0 1 0 1 0 
1 0 1 0 1 0 1 0 1 

 */
package pattern;
import java.util.Scanner;
public class Pattern39 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range.");
		int n=sc.nextInt();
		for (int i = 1; i <=n; i++)
		{
			for (int j =1; j <=n-i; j++) 
			{
				System.out.print("  ");
			}
			int k=i;
			for (int j = 1; j <=i*2-1; j++) 
			{
				System.out.print(k%2+" ");
				k++;
			}
			System.out.println();
		}
	}
}
