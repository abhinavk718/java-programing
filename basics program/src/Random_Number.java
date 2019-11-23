import java.util.Random;
import java.util.Scanner;
public class Random_Number
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		sc.close();
		Random rn=new Random();
		int rd=rn.nextInt(10);
		System.out.println(rd);
		if(rd==num)
			System.out.println("you won the game.");
		else
		{
			System.out.println("you loose the game.");
		}
			System.out.println("Try again.");
	}
}
