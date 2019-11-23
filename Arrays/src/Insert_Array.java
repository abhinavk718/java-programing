import java.util.Scanner;
public class Insert_Array 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many elements you have to store in first array.");
		int p=sc.nextInt();
		int ar[]=new int[p];
		System.out.println("Plz enter "+p+" element.");
		for (int i = 0; i < ar.length; i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Enter how many elements you have to store in second array.");
		int q=sc.nextInt();
		int ar1[]=new int[q];
		System.out.println("Plz enter "+q+" element.");
		for (int i = 0; i <q; i++)
		{
			ar1[i]=sc.nextInt();
		}
		System.out.println("Enter the index at which you want to insert anothr array.");
		int index=sc.nextInt();
		int res[]=insertArray(ar,ar1,index);
		System.out.println("Array elements are : ");
		for (int i = 0; i < res.length; i++)
		{
			System.out.println(res[i]);
		}
	}
	public static int[] insertArray(int []x,int[]y,int index)
	{
		int []z=new int[x.length+y.length];
		while(index<0||index>x.length)
		{
			System.out.println("Index out of range.");
			return x;
		}
		for (int i = 0; i < x.length; i++) 
		{
			if(i<index)
				z[i]=x[i];
			else
				z[i+y.length]=x[i];
		}
		for (int i = 0; i < y.length; i++) 
		{
			z[index+i]=y[i];
		}
		return z;
	}
	

}
