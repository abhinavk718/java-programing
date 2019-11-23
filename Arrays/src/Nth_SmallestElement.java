import java.util.Scanner;
public class Nth_SmallestElement 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many elements do you have to store.");
		int n=sc.nextInt();//{45,78,15,98,75}
		int ar[]=new int[n];
		System.out.println("plz enter "+n+" element.");
		for (int i = 0; i <n; i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Enter the index.");
		int p=sc.nextInt();
		int res=nthSmallestElement(ar,p);
		System.out.println("the "+p+"th smallest element in an array is : "+res);
		sc.close();
	}
	public static int nthSmallestElement(int []x,int y)
	{
		for (int i = 0; i < x.length; i++) 
		{
			int count=0;
			for (int j = 0; j < x.length; j++) 
			{
				if(x[j]<x[i])
					count++;	
			}
			if(count==y-1)
				return x[i];
		}
		return 0;
	}
}
