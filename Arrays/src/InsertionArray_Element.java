import java.util.Scanner;
public class InsertionArray_Element
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many elements you have to store in first array.");
		int p=sc.nextInt();
		int ar[]=new int[p];
		System.out.println("Plz enter "+p+" elements");
		for (int i = 0; i<p; i++) 
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Enter how many elements you have to store in second array.");
		int q=sc.nextInt();
		int ar1[]=new int[q];
		System.out.println("Plz enter "+q+" elements");
		for (int i = 0; i<q; i++) 
		{
			ar1[i]=sc.nextInt();
		}
		System.out.println("Enter the element which you want to store.");
		int ele=sc.nextInt();
		System.out.println("Enter the index at which you want to store the element.");
		int index=sc.nextInt();
		System.out.println("Array elements are :");
		int res[]=combineArray(ar,ar1);
		int res1[]=insertElement(res,ele,index);
		for (int i = 0; i < res1.length; i++)
		{
			System.out.println(res1[i]);
		}
	}
	public static int[] combineArray(int x[],int y[])
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
	public static int[] insertElement(int x[],int ele,int index)
	{
		int y[]=new int[x .length+1];
		for (int i = 0; i < x.length; i++) 
		{
			if(i<index)
				y[i]=x[i];
			else
				y[i+1]=x[i];
		}
		y[index]=ele;
		return y;
	}
}
