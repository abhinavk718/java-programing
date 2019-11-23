import java.util.Scanner;
public class ArrayOperation 
{
	int arrayProduct(int[]x)
	{
		int product=1;
		for(int i=0;i<x.length;i++)
		{
			product=product*x[i];
		}
		return product;
	}
       int[] readArray()
	   {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("plz enter how many elements you have to store.");
		   int size=sc.nextInt();
		   int[]x=new int[size];
		   System.out.println("plz enter "+size+" elements.");
		   for(int i=0;i<x.length;i++)
		   {
			   x[i]=sc.nextInt();
		   }
		   return x;
	   }
       void dispIntArray(int []y)
       {
    	   System.out.println("Array elements are : ");
    	   for(int i=0;i<y.length;i++)
    	   {
    		   System.out.println(y[i]);
    	   }
       }
       double calculateavg(int[]x)
       {
    	   int sum=0;
    	   for(int i=0;i<x.length;i++)
    	   {
    		   sum=sum+x[i];
    	   }
    	   return sum/x.length;
       }
}
