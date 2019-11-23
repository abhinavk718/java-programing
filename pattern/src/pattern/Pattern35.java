/*
r 
r a 
r a g 
r a g h 
r a g h a 
r a g h a v 
 */
package pattern;
import java.util.Scanner;
public class Pattern35
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word.");
		String st=sc.next();
		int n=st.length();
		for (int j = 1; j <=n; j++)
		{
			for (int i =0; i<j; i++) 
			{
				System.out.print(st.charAt(i)+" ");
			}
			System.out.println();
		}
	}
}

