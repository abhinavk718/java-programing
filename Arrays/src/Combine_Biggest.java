import java.util.Scanner;
public class Combine_Biggest 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of first array");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Plz enter "+n+"elements.");
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
		System.out.println("Enter the size of second array");
		int p=sc.nextInt();
		int ar1[]=new int[p];
		System.out.println("Plz enter "+p+" elements.");
		for (int i = 0; i <p; i++) 
		{
			ar1[i]=sc.nextInt();
		}
		System.out.println("Entered elements are :");
		for (int i = 0; i <p; i++)
		{
			System.out.print(ar1[i]+" ");
		}
		System.out.println();
		int res[]=combineArray(ar,ar1);
		int result=biggestElement(res);
		System.out.println("Biggest element in a combined array are :"+result);	
		sc.close();
    }
	static int[] combineArray(int []x,int[]y)
	{
		int z[]=new int[x.length+y.length];
		for (int i = 0; i < x.length; i++)
		{
			z[i]=x[i];
		}
		for (int i = 0; i < y.length; i++) 
		{
			z[x.length+i]=y[i];
		}
		return z;
	}
	static int biggestElement(int[]x)
	{
		int big=x[0];
		for (int i = 1; i < x.length; i++) 
		{
			if (big<x[i])
			{
				big=x[i];
			}
		}
		return big;
	}
}
