import java.util.Scanner;
public class CombineArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of first array.");
		int n=sc.nextInt();
		System.out.println("Enter "+n+" elements");
		int ar[]=new int[n];
		for (int i = 0; i <n; i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Entered element in first Array are :");
		for (int i = 0; i <n; i++) 
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		System.out.println("Enter the size of second array.");
		int n1=sc.nextInt();
		System.out.println("Enter "+n1+" elements.");
		int ar1[]=new int[n1];
		for (int i = 0; i <n1; i++)
		{
			ar1[i]=sc.nextInt();
		}
		System.out.println("Entered element in second array are : ");
		for (int i = 0; i <n1; i++)
		{
			System.out.print(ar1[i]+" ");
		}
		System.out.println();
		System.out.println("Elements in an combined array are : ");
		int ar2[]=new int[ar.length+ar1.length];
		for (int i = 0; i < ar.length; i++)
		{
			ar2[i]=ar[i];
		}
		for (int i = 0; i < ar1.length; i++) 
		{
			ar2[ar.length+i]=ar1[i];
		}
		for (int i = 0; i < ar2.length; i++) 
		{
			System.out.print(ar2[i]+" ");
		}
		sc.close();
	}
}
