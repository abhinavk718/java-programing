import java.util.Scanner;
public class Find_PowerFactor 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of p & q.");
		int p=sc.nextInt();
		int q=sc.nextInt();
		int pf=calPowFactor(p,q);
		System.out.println("The power factor is "+pf);
		sc.close();
	}
	public static int calPowFactor(int p,int q)
	{
		int pow=1;
		while(q>=1)
		{
			pow=pow*p;
			q--;
		}
		return pow;
	}

}
