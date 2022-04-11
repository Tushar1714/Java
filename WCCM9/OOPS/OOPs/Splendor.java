package OOPs;

public class Splendor extends Abstraction {

	public static void main(String[] args) 
	{

		WagonR c= new  WagonR();
		c.start();
		
		Splendor obj = new Splendor();	
		obj.start();
	}

	void start() 
	{

		System.out.println("Splendor Starts with kick");
	}

}
