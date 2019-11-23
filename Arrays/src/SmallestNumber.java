import java.util.Scanner;
public class SmallestNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size.");
		int n=sc.nextInt();
		System.out.println("Plz enter "+n+"elements.");
		int ar[]=new int[n];
		for (int i = 0; i <n; i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Entered elements are :");
		for (int i = 0; i <n; i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		int s=ar[0];
		for (int i = 1; i <n; i++)
		{
			if (s>ar[i])
			{
				s=ar[i];
			}
		}
		System.out.println("Smallest element in an array are :"+s);
		sc.close();
	}
}
