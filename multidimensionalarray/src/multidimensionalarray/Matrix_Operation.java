package multidimensionalarray;
import java.util.Scanner;
public class Matrix_Operation
{
	int[][] readMatrix()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz enter number of rows.");
		int rows=sc.nextInt();
		System.out.println("plz enter number of column.");
		int col=sc.nextInt();
		int[][]mat=new int[rows][col];
		System.out.println("plz enter "+rows*col+" elements.");
		for (int i = 0; i < mat.length; i++) 
		{
			for (int j = 0; j < mat[i].length; j++) 
			{
				mat[i][j]=sc.nextInt();
			}
		}
		return mat;
	}
	int[][] addMatrix(int [][]x,int [][]y)
	{
		if(x.length!=y.length||x[0].length!=y[0].length)
		{
			System.out.println("Addition not possible.");
			return null;			
		}
		int [][]z=new int[x.length][x[0].length];
		for (int i = 0; i < z.length; i++)
		{
			for (int j = 0; j < z[i].length; j++)
			{
				z[i][j]=x[i][j]+y[i][j];
			}
		}
		return z;
	}
	public void dispMat(int mat[][])
	{
		for (int i = 0; i < mat.length; i++)
		{
			for (int j = 0; j < mat[i].length; j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
}
