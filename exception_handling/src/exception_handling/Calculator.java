package exception_handling;
import java.util.*;
public class Calculator 
{
	void calculate()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number.");
		int p=sc.nextInt();
		System.out.println("Enter the second number.");
		int q=sc.nextInt();
		Math m=new Math();
		try 
		{
			m.divide(p,q);
		}
		catch(Exception e)
		{
			System.out.println("Enter proper input.");
		}
		sc.close();
	}
	public static void main(String[] args) 
	{
		Calculator c=new Calculator();
		c.calculate();
	}
}
