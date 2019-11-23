import java.util.Scanner;
public class Find_Index 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("how many elements you have to store.");
		int n=sc.nextInt();
	    int ar[]=new int[n];
		System.out.println("plz enter "+n+" elements.");
		for (int i = 0; i <n; i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Entered elements are :");
		for (int i = 0; i < ar.length; i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		System.out.println("Enter the element for which you want to find the index.");
		int p=sc.nextInt();
		int res=findIndex(ar,p);
		System.out.println("Index of "+p+" is "+res);
		sc.close();
	}
	static int findIndex(int []x,int y)
	{
		for (int j = 0; j < x.length; j++) 
		{
			if(x[j]==y)
				return j;
		}
		return -1;
	}
}