package Practice;

public class Chaining2 extends Chaining1{

	public Chaining2() {
	super();
		System.out.println("i am in child class constructor");
	}
	Chaining2(int a){
		super(20);
		System.out.println(a);
	}
	Chaining2(String c)
	{
	this();
	System.out.println(c);
		
	}
	public static void main(String[] args) {
		Chaining2 obj = new Chaining2();
		Chaining2 obj1 =new Chaining2(10);
	Chaining2 obj2 =new Chaining2("20");
		System.out.println();
	}
}
