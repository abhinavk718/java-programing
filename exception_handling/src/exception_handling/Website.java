package exception_handling;
public class Website 
{
	public void applyForVote(int age)
	{
	    if (age>=18) 
		{  
	    	System.out.println("Accepted");
		} 
		else
		{
			InvalidAgeException iae=new InvalidAgeException();
			iae.getMessage();
			throw iae;
		}
	}
}