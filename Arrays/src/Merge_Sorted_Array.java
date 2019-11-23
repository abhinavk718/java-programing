import java.util.Scanner;
public class Merge_Sorted_Array 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elements dou have to store in first array.");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Plz enter "+n+" elements");
		for (int i = 0; i < ar.length; i++) 
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("How many elements do you have to store in second array.");
		int p=sc.nextInt();
		int ar1[]=new int[p];
		System.out.println("Plz enter "+p+" elements");
		for (int i = 0; i < ar1.length; i++) 
		{
			ar1[i]=sc.nextInt();
		}
		System.out.println("Sorted merge array are:");
		System.out.println();
		int[]res=sortedMerge(ar,ar1);
		for (int i = 0; i < res.length; i++)
		{
			System.out.println(res[i]+" ");
		}
	}
	static int[] sortedMerge(int []x,int[]y)
	{
		int z[]=new int[x.length+y.length];
		int i=0,j=0,k=0;
		while (i<x.length&&j<y.length)
		{
			if(x[i]>y[j])
				z[k++]=y[j++];
			else 
				z[k++]=x[i++];
		}
		while (i<x.length)
		{
			z[k++]=x[i++];
		}
		while(j<y.length)
		{
			z[k++]=y[j++];
		}
		return z;
	}
}
