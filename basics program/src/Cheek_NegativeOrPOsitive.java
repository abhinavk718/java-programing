import java.util.Scanner;

public class Cheek_NegativeOrPOsitive 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		int num=sc.nextInt();
		sc.close();
		if(num>0)
			System.out.println(num+" is possitive.");
		else if(num<0)
			System.out.println(num+" is negative.");
		else 
			System.out.println(num+" is zero.");
	}

}
