import java.util.Scanner;
public class Deletion_ArrayElement
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many elements you have to store.");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Plz enter "+n+" elements.");
		for (int i = 0; i < ar.length; i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Enter the index at which you want to delete element.");
		int index=sc.nextInt();
		System.out.println("Array elements are.");
		int res[]=deleteArrayElement(ar,index);
		for (int i = 0; i < res.length; i++)
		{
			System.out.println(res[i]);
		}
	}
	public static int[] deleteArrayElement(int []x,int in)
	{
		int y[]=new int[x.length-1];
		if(in<0||in>=x.length)
		{
			System.out.println("Index out of range.");
			return x;
		}
		for (int i = 0; i < y.length; i++)
		{
			if(i<in)
				y[i]=x[i];
			else
				y[i]=x[i+1];
				
		}
		return y;
	}
}
