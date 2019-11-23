package jspiderbtm.demoapp;
public class Student 
{
	public String name="Abhinav";
	private  int age;
	private double balanceFee;
	private String gmail;
	public void setAge(int a)
	{
		if(a>=18)
		{
			this.age=a;
			System.out.println("Age : " +this.age);
		}
	    else
	     {
		   System.out.println("Not eligible for vote.");
	     }
	}
	public int getAge()
	{
		return this.age;
	}
	public void setBalance(double d)
	{
		if(d>0)
		{
			this.balanceFee=d;
		    System.out.println("remaning fee is "+this.balanceFee);
		}
	}
	public double getBalance()
	{
		return this.balanceFee;
	}
	public String setGmail(String g)
	{
		this.gmail=g;
		System.out.println("Mail id : "+this.gmail);
		
		return this.gmail;
	}
	public String getGmail()
	{
		return this.gmail;
	}
}