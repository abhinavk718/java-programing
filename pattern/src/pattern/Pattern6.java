/*
* * * * * 
* * * * 
* * * 
* * 
* 
 */
package pattern;
import java.util.*;
public class Pattern6
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the range.");
		int n=sc.nextInt();
		for (int i = n; i >0; i--) 
		{
			for (int j =i; j >0 ; j--)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
			sc.close();
		}
	}
}
