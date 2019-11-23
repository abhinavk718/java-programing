package test;
public class Flower
{
	String type,clr;
	public Flower(String type,String clr) 
	{
		this.clr=clr;
		this.type=type;
	}
	@Override
	public String toString()
	{
        return "["+this.clr+" "+this.type+"]";
	}
	public static void main(String[] args)
	{
		Flower f=new Flower("RED","ROSE");
		System.out.println(f);
	}
}
