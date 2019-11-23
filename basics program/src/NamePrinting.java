import java.util.Scanner;
public class NamePrinting 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.nextLine();
		System.out.println("Enter the number.");
		int n=sc.nextInt();
		while(n>0)
		{
			System.out.println(name);
			n--;
		}
		sc.close();
	}
}
