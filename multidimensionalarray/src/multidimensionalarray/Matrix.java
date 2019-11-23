package multidimensionalarray;
import java.util.Scanner;
public class Matrix
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz enter rows.");
		int rows=sc.nextInt();
		System.out.println("plz enter column.");
		int col=sc.nextInt();
		int mat[][]=new int[rows][col];
		System.out.println("Plz enter "+rows*col+" elements.");
		for (int i = 0; i < mat.length; i++) 
		{
			for (int j = 0; j < mat[i].length; j++) 
			{
				mat[i][j]=sc.nextInt();
			}
		}
		System.out.println("Entered matrix are :");
	    for(int i=0;i<mat.length;i++)
	    {
		    for(int j=0;j<mat[i].length;j++)
		    {
		    	System.out.print(mat[i][j]+" ");
		    }
		    System.out.println();
		    sc.close();
	    }
	}
}
