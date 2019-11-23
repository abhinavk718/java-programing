import java.util.Scanner;
public class Count_PrimeNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many elements you have to store in an array.");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("plz enter "+n+" elements.");
		for (int i = 0; i <n; i++)
		{
			ar[i]=sc.nextInt();
		}
		sc.close();
		int res=countPrime(ar);
		System.out.println("Prime number in the given array are : "+res);
	}
	static boolean isPrime(int x)
	{
		for (int i = 2; i <=x/2; i++) 
		{
			if (x%i==0) 
			return false;
		}
		return true;
	}
	static int countPrime(int []x)
	{
		int count=0;
		for (int i = 0; i < x.length; i++) 
		{
			if (isPrime(x[i]))
			count++;
		}
		return count;
	}
}