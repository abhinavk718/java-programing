package exception_handling;
public class Math 
{
	public void divide(int fn,int sn)throws ArithmeticException
	{
		int res=fn/sn;
		System.out.println("Division of two number is : "+res);
	}
}
