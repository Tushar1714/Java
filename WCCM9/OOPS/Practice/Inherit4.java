package Practice;

public class Inherit4 extends Inherit3{

	Inherit4()
	{
		System.out.println("i am in child class constructor");
	}
	int c=10;
	{
		System.out.println("i am in nonstatic block of child class");
	}
	public void demo()
	{
		System.out.println("i am in nonstatic method of child class");
	}
	
	public static void main(String[] args) {
		
		Inherit4 obj = new Inherit4();
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		obj.test();
		obj.demo();
	}
}
