package exception_handling;
public class InvalidAgeException extends RuntimeException
{
	String reason="Invalid age.Age must be atleast 18.";
	@Override
	public String getMessage()
	{
		return reason;
	}/*
	@Override
	public String toString()
	{
		return reason;
	}*/
}
