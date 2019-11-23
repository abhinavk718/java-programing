package multidimensionalarray;
public class MainMat 
{
	public static void main(String[] args) 
	{
		int mat[][]= {{23,25,37,47},{56,78},{31,23,45}};
		System.err.println("Number of rows --> "+mat.length);
		System.out.println("Number of elements in first row --> "+mat[0].length);
		System.out.println("Number of elements in second row --> "+mat[1].length);
		System.out.println("Number of elements in last row --> "+mat[mat.length-1].length);
		System.out.println("Matrix elements are :");
		for(int i=0;i<mat.length;i++)//no of rows
		{
			for (int j = 0; j < mat[i].length; j++)//no of elements
			{
				
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
}