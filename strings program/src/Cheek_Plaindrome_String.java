import java.util.Scanner;
public class Cheek_Plaindrome_String
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word.");
		String str=sc.next();
		boolean res=isPlaindrome(str);
		sc.close();
		if (res)
		    System.out.println(str +" is plaindrome.");
		else 
		System.out.println(str +" is not plaindrome.");
	}
	public static  boolean isPlaindrome(String st)
	{
		int i=0;
		int n=st.length()-1;
		while(i<n)
		{
			if(st.charAt(i)!=st.charAt(n))
				return false;
				i++;
				n--;
		}
		return true;
	}
}
