import java.util.Scanner;
public class Cheek_EligibleForVote 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age.");
		int age=sc.nextInt();
		sc.close();
		boolean rs=elegibleForVote(age);
		if(rs)
			System.out.println("You are elegible for vote.");
		else
	        System.out.println("You are not elegible for vote.");
	}
	public static boolean elegibleForVote(int x)
	{
		if(x>=18)
			return true;
		return false;
	}
}
