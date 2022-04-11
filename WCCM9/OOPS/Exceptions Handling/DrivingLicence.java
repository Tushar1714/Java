class DrivingLicence
{
	public static void age(int Y) throws AgeInvalid
	{
		if (Y>18)
		{
			throw new AgeInvalid("NOt Eligible For Applying the Driving Licence");
		}
		else
		{
			System.out.println("Eligible for Applying the Driving Licence");

		}
	}
	public static void main(String[] args) 
	{
	    	System.out.println("Enter Your Age");
		try
		{
			age(16);
		}
		catch (Exception c)
		{
			System.out.println(c);

		}
	    	System.out.println("Thank You");

	}
}
