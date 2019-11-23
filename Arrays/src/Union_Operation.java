import java.util.Scanner;
public class Union_Operation 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many elements you have to store in first array.");
		int p=sc.nextInt();
		int ar[]=new int[p];
		System.out.println("Plz enter "+p+" element.");
		for (int i = 0; i <p; i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Enter how many elements you have to store in second array.");
		int q=sc.nextInt();
		int ar1[]=new int[q];
		System.out.println("Plz enter "+q+" element.");
		for (int i = 0; i <q ;i++)
		{
			ar1[i]=sc.nextInt();
		}
		sc.close();
		System.out.println("Union of two arrays are :");
		int res[]=unionOperation(ar,ar1);
		for (int i = 0; i < res.length; i++) 
		{
			System.out.println(res[i]);
		}
	}
	public static int[] unionOperation(int []x,int []y)
	{
		int z[]=new int[x.length+y.length];
		int k=0;
		for (int i = 0; i<x.length; i++) 
		{
				z[k++]=x[i];
		}
		for (int i = 0; i < y.length; i++)
		{
			int find=0;
			for (int j = 0; j <x.length; j++)
			{
				if(y[i]==x[j])
				{
					find=1;
					break;
				}
			}
			if(find==0)
				z[k++]=y[i];
		}
		int nar[]=new int[k];
		for (int i = 0; i < nar.length; i++)
		{
			nar[i]=z[i];
		}
		return nar;
	}
}
