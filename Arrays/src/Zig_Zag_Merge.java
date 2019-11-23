import java.util.Scanner;
public class Zig_Zag_Merge 
{
	public static void main(String[] args) 
	{
	     Scanner sc=new Scanner(System.in);
	     System.out.println("how many elements do you have to store in first array .");
	     int n=sc.nextInt();
	     System.out.println("Enter "+n+" elements : ");
	     int ar[]=new int[n];
	     for (int i = 0; i <n; i++)
	     {
			ar[i]=sc.nextInt();
		 }
	     System.out.println("How many elements do you have to store in second array.");
	     int p=sc.nextInt();
	     System.out.println("Enter "+p+" elements : ");
	     int ar1[]=new int[p];
	     for (int i = 0; i <p; i++)
	     {
			ar1[i]=sc.nextInt();
		 }
	     System.out.print("Zig_zag merge of two arrays are :");
	     int res[]=zigZagMerge(ar,ar1);
	     for (int i = 0; i < res.length; i++)
	     {
			System.out.print(res[i]+" ");
		 }
     }
	static int[] zigZagMerge(int x[],int[]y)
	{
		int i=0,j=0,k=0;
		int z[]=new int[x.length+y.length];
		while(i<x.length && j<y.length)
		{
			z[k++]=x[i++];
			z[k++]=y[j++];
		}
		while(i<x.length)
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
