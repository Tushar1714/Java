package Practice;

public class Updowncasting2 extends Updowncasting{

	int b = 50;
	void method2()
	{
		System.out.println("i am in child method");
	}
	public static void main(String[] args) {
		Updowncasting2 obj1 = new Updowncasting2();
//Updowncasting obj2 = obj1;	// upcasting
//	obj1.method();
//	obj2.method();
//	System.out.println(obj2.a);
	
	Updowncasting obj2 = (Updowncasting) obj1;
		((Updowncasting2) obj2).method2();
		System.out.println(((Updowncasting2)obj2).b);
	}
}
