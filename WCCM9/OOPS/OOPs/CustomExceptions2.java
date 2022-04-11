package OOPs;

public class CustomExceptions2 extends RuntimeException 
{
//Example for Unchecked Exception
	CustomExceptions2() 
	{
	super("You Are UnderAge");
	}
	CustomExceptions2(String message)
	{
		super(message);
	}
	 
}
