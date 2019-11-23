import java.util.Scanner;
public class Person_imformation 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name??");
		String name=sc.nextLine();
		System.out.println("Enter your age??");
		int age=sc.nextInt();
		System.out.println("Enter your weight??");
		double wt=sc.nextDouble();
		System.out.println("Enter your height??");
		double ht=sc.nextDouble();
		System.out.println("Enter your mobile number??");
		long mn=sc.nextLong();
		System.out.println("name ---->"+name);
		System.out.println("age ---->"+age);
		System.out.println("weight ---->"+wt);
		System.out.println("height ---->"+ht);
		System.out.println("mobile number ---->"+mn);
		sc.close();
	}
}
