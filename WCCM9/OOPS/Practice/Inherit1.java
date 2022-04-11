package Practice;

public class Inherit1 {
	
  static	int a=20;	//static members have only one copy and only one memory allocation
	public static void main(String[] args) {
		System.out.println(a);
	}
	
	public static void test()
	{
		System.out.println("Hi Tushar!");
	}
	static
	{
		System.out.println("This is Static Block!");
	}
}

