package test;
public class FlyingShoe 
{
	String type;
	String brand;
	int size;
	public FlyingShoe(String type,String brand,int size) 
	{
		this.type=type;
		this.brand=brand;
		this.size=size;
	}
	@Override
	public String toString()
	{
	return "{"+this.type+this.brand+"SIze "+this.size+"}";
	}
	public static void main(String[] args)
	{
		FlyingShoe fs=new FlyingShoe("FlyingShoe:","Manufactured by Bata:",12);
		System.out.println(fs);
	}

}
