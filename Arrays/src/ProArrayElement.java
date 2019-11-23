public class ProArrayElement 
{
	public static void main(String[] args)
	{
		ArrayOperation ao=new ArrayOperation();
		int z[]=ao.readArray();
		ao.dispIntArray(z);
		int pro=ao.arrayProduct(z);
		System.out.println("Product of array elements are :"+pro);
	}

}