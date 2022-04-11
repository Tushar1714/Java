package Practice;

public interface I1 {

	public static final int a = 10;					//static final variable
	public abstract void demo();		//non-static abstract method
	
	public static void display()			//static concrete method
	{
		System.out.println("i am in static concrete method");
	}
	default void test()						// default concrete method 
	{
		System.out.println("I am in default nonstatic concrete method");
	}

	
	
}
