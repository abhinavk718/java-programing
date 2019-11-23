package multidimensionalarray;

public class Addition_Matrix 
{
	public static void main(String[] args)
	{
		Matrix_Operation mo=new Matrix_Operation();
		System.out.println("Enter first matrix element.");
		int[][]a=mo.readMatrix();
		System.out.println("Enter second matrix element.");
		int[][]b=mo.readMatrix();
		int [][]sum=mo.addMatrix(a,b);
		System.out.println("Addition of matrix is:");
		if(sum!=null)
		mo.dispMat(sum);
	}

}
