package pattern;
public class Pattern48
{
	public static void main(String[] args)
	{
		int n = 6;
		for (int i = 1; i <= n; i++)
		{
			int k = 1;
			for (int j = 0; j < n - i; j++)
			{
				System.out.print("  ");
			}
			for (int j = 0; j < 2 * i - 1; j++) 
			{ 
				if(j%2==1)
			    {
				System.out.print("* ");
			    }
			    else 
			    {
				System.out.print(k + " ");
				k++;
			    }
			}
		    System.out.println();
		}
	}
}