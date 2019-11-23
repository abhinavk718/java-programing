public class AverageArray 
{
	public static void main(String[] args)
	{
		ArrayOperation ao=new ArrayOperation();
		int z[]=ao.readArray();
		ao.dispIntArray(z);
		double avg=ao.calculateavg(z);
		System.out.println("Average of array elements are :"+avg);
	}

}