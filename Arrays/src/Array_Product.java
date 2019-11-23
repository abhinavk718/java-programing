import java.util.Scanner;
public class Array_Product 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array.");
		int n=sc.nextInt();
		System.out.println("Plz enter "+n+" elements.");
		int ar[]=new int[n];
		for (int i = 0; i <n; i++) 
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Entered elements in an array are :");
		for (int i = 0; i <n; i++) 
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		int res=Array_Product.arrayProduct(ar);
		System.out.println("Product of array elements are :"+res);
		sc.close();
	}
	static int arrayProduct(int []x) 
	{
		int product=1;
		for (int i = 0; i < x.length; i++) 
		{
			product=product*x[i];	
		}
		return product;
	}
}
