import java.util.Scanner;
public class Read_Student_Name_Marks 
{
	public static void main(String[] args)
	{
		double p,c,m,e,total,percentage;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student name??");
		String name=sc.nextLine();
		System.out.println("Enter four subject marks of "+name);
		p=sc.nextDouble();
		c=sc.nextDouble();
		m=sc.nextDouble();
		e=sc.nextDouble();
		total=p+c+m+e;
		percentage=total/4;
		System.out.println("total marks ----->"+total);
		System.out.println("percentage ------>"+percentage);
		sc.close();
	}
}
