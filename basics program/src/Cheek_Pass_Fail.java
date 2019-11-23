import java.util.Scanner;
public class Cheek_Pass_Fail 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz enter four subject marks.");
		int p=sc.nextInt();
		int c=sc.nextInt();
		int m=sc.nextInt();
		int e=sc.nextInt();
		if(p<35||c<35||m<35||e<35)
			System.out.println("you are fail.");
		else 
			System.out.println("you are pass.");
	}
}
