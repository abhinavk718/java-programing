import java.util.Scanner;
public class Last_TwoDigit
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number.");
	    long num=sc.nextLong();
	    sc.close();
	    if(num>99||num<-99)
	    	num=num%100;
	    System.out.println("last two digit niumber is "+num);
    }
}
