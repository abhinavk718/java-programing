import java.util.Scanner;
public class Display_Number_OfDays
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);	
		System.out.println("Plz enter month number.");
		int n=sc.nextInt();
		if (n<1||n>12)
			System.out.println("Invalid month number.");
		else if(n==1||n==3||n==5||n==7||n==8||n==10||n==12)
		         System.out.println(n+" Has 31 days.");
		    else if(n==4||n==6||n==9||n==11)
			System.out.println(n+" has 30 days.");
			else if(n==2)
				System.out.println(n+" Has 28/29 days.");	
		else
			System.out.println("Invalid");
		sc.close();
	}
}
