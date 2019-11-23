/* 
j a v a 
j a v 
j a 
j 
 */
package pattern;
import java.util.Scanner;
public class Pattern34 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word.");
		String st=sc.next();
		int n=st.length();
		for (int i = n; i >0; i--)
		{
			for (int j = 0; j <i; j++) 
			{
				System.out.print(st.charAt(j)+" ");
			}
			System.out.println();
		}
	}
}
