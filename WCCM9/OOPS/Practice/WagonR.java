package Practice;

public class WagonR extends Car
{
	int a=50;
	static char c = 'T';
	void run()
	{
		
	}
	static void applyBreak()
	{
		System.out.println("Breaks have Applied");
	}
	{
		System.out.println("i am in WagonR bock");
	}
	static
	{
		System.out.println("i am driving WagonR static block");
	}
	WagonR()
	{
		System.out.println("i am in WagonR constructor");
	}
	public static void main(String[] args) {
		
		WagonR obj = new WagonR();
		obj.starts();
		obj.open();
		obj.run();
		obj.applyBreak();
		
	}
}

