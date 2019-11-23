/*
54321
4321
321
21
1

 */
package pattern;
import java.util.Scanner;
public class Pattern15
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range.");
		int n=sc.nextInt();
		for(int i=n;i>0;i--)
		{
			for (int j=i;j>0;j--) 
			{
			System.out.print(j);	
			}
			System.out.println();
			sc.close();
		}
	}
}
