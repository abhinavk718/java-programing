import java.util.Scanner;
public class Minus_Operation 
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
		System.out.println("Minus of two arrays are :");
		int res[]=minusOperation(ar,ar1);
		for (int i = 0; i < res.length; i++) 
		{
			System.out.println(res[i]);
		}
	}
	public static int[] minusOperation(int []x,int []y)
	{
		int z[]=new int[x.length];
		int k=0;
		for (int i = 0; i <x.length; i++) 
		{
			int find=0;
			for (int j = 0; j < y.length; j++) 
			{
				if(x[i]==y[j])
				{
					find=1;
				    break;
				}
			}
			if(find==0)
				z[k++]=x[i];
		}
		int nar[]=new int[k];
		for (int i = 0; i < nar.length; i++)
		{
			nar[i]=z[i];
		}
		return nar;
	}
}

