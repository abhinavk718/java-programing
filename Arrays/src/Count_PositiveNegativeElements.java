import java.util.Scanner;
public class Count_PositiveNegativeElements
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz Enter how many elements you have to store");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Plz enter "+n+" elements.");
		for (int i = 0; i < ar.length; i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Entred elements are.");
		for (int i = 0; i < ar.length; i++) 
		{
			System.out.print(ar[i]+" ");
		}
		int pc=0,nc=0;
		for (int i = 0; i < ar.length; i++) 
		{
			if(ar[i]>0)
				pc++;
			else
				nc++;
		}
		System.out.println("Positive number are :"+pc);
		System.out.println("Positive number are :"+nc);
		sc.close();
	}
}
