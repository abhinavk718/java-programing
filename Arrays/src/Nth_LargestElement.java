import java.util.Scanner;
public class Nth_LargestElement 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many elements you have to store in an array");
		int p=sc.nextInt();//{58,48,65,78,26}
		int ar[]=new int[p];
		System.out.println("Plz enter "+p+" element.");
		for (int i = 0; i <p; i++) 
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Enter the index.");
		int n=sc.nextInt();
		int res=nthLargestArray(ar,n);
		System.out.println("the "+n+"th largest element in an array is : "+res);
		sc.close();
	}
	public static int nthLargestArray(int []x,int y)
	{
		for (int i = 0; i <x.length; i++) 
	    { 
			int count=0;
			for (int j = 0; j< x.length; j++)
			{
				if(x[j]>x[i])
					count++;
			}
			if(count==y-1)
				return x[i];
		}
		return 0;
	}
}
