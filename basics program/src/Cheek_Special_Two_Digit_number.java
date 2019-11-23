import java.util.Scanner;
public class Cheek_Special_Two_Digit_number
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.");
		int n=sc.nextInt();
		sc.close();
		boolean res=isSpecialTwoDigitNumber(n);
		if(res)
			System.out.println(n+" is a special two digit number.");
		else
			System.out.println(n+" is a not special two digit number.");
	}
	static public boolean isSpecialTwoDigitNumber(int x)
	{
		int ld=x%10;
		int fd=x/10;
		if((ld+fd)+(fd*ld)==x)
			return true;
		return false;
	}
}
