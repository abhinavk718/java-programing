import java.util.Scanner;
public class Biggest_Number
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz enter three number.");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b&&a>c)
			System.out.println(a+" is big");
		else if(b>c)
			System.out.println(b+" is big.");
		else if(a==b&&b==c)
			System.out.println("all are equal.");
		else 
			System.out.println(c+" is big.");
	}
}
