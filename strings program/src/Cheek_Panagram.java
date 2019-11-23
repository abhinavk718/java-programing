/* program to print frequency of each character in the string?? */
import java.util.Scanner;
public class Cheek_Panagram 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence.");
		String str=sc.nextLine();
		boolean res=isPanagram(str);
		if(res)
			System.out.println("Panagram");
		else
			System.out.println("not Panagram");
	}
	public static boolean isPanagram(String st)
	{
		if (st.length()<26)
		return false;
		char []count=new char[26];
		for (int i = 0; i < st.length(); i++)
		{
			char ch=st.charAt(i);
			if(ch>=65&&ch<=90)
				count[ch-65]++;
			else
				if(ch>=97&&ch<=122)
					count[ch-97]++;
		}
		for (int j = 0; j < count.length; j++) 
		{
			if(count[j]==0)
				return false;
		}
		return true;
	}
}
