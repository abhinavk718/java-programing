import java.util.Scanner;
public class Array_Sum1 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("plz enter how many elements you have to store.");
		int n=sc.nextInt();
		System.out.println("Plz enter "+n+" elements in an array.");
		int ar[]=new int[n];
		for (int i = 0; i < ar.length; i++) 
		{
			ar[i]=sc.nextInt();
		}
		int sum=0;
		for (int i = 0; i < ar.length; i++)
		{
			sum=sum+ar[i];
		}
		System.out.println("Sum of array elements are "+sum);
		sc.close();
	}
}
