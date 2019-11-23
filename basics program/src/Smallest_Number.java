import java.util.Scanner;
public class Smallest_Number
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers.");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a<b&&a<c)
			System.out.println(a+" is smallest among three numbers");
		else if(a==b&&b==c)
			System.out.println("All are equal numbers");
		else if(b<c)
			System.out.println(b+" is smallest among three numbers");
		else
			System.out.println(c+" is smallest among three numbers");
		sc.close();
	}

}
