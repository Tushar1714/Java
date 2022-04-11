package Practice;

public class Chaining3 {

	int a=10;
	void test(int a)
	{
		System.out.println(a);
		System.out.println("test method");
	}
	Chaining3(int a)
	{
		System.out.println("i am in parent constructor");
		System.out.println(a);	
	}
}
