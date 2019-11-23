import java.util.Random;
public class Random_SpecialTwoDigitNumner 
{
	public static void main(String[] args)
	{
		Random rd=new Random();
		int rn=rd.nextInt(100);
		System.out.println("Random generated number is :"+rn);
		boolean res=isSpecialNumber(rn);
		if(res)
			System.out.println(rn+" is a special two digit number.");
		else
			System.out.println(rn+" is not a special two digit number.");
	}
	public static boolean isSpecialNumber(int n)
	{
		int ld=n%10;
		int fd=n/10;
		if((ld+fd)+(ld*fd)==n)
			return true;
		return false;
	}
}