import java.util.Scanner;
public class Sanju_Weds_Geeta 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		sc.close();
		if(num%3==0&&num%5!=0)
			System.out.println("SANJU");
		else if(num%5==0&&num%3!=0)
			System.out.println("GEETA");
		else if(num%3==0||num%5==0)
			System.out.println("SANJU WEDS GEETA");
		else
			System.out.println("BREAK UP");
	}
}