import java.util.Scanner;
public class Count_Each_Character 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string.");
		String st=sc.nextLine();
		int uc=0,lc=0,dc=0,sch=0,vc=0,cc=0;
		for (int i = 0; i <st.length(); i++)
		{
			char ch=st.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				uc++;
			    if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				vc++;
			    else 
			    	cc++;
			}
			else if(ch>='a'&&ch<='z')
			{
				lc++;
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					vc++;
				else
					cc++;
			}
			else if(ch>='0'&&ch<='9')
				dc++;
			else
				sch++;
		}
		System.out.println("Uppercase character is : "+uc);
		System.out.println("Lowercase character is : "+lc);
		System.out.println("vowel character is : "+vc);
		System.out.println("Consonent character is : "+cc);
		System.out.println("Digit character is : "+dc);
		System.out.println("Special character is : "+sch);
		sc.close();
	}
}
