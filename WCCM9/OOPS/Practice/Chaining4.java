package Practice;

public class Chaining4 extends Chaining3 {

	int a=20;
	void demo(int a)
	{
		super.test(30);
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
	Chaining4(int a)
	{
		super(50);
		System.out.println("i am in constructor child");
		System.out.println(a);
	}
	public static void main(String[] args) {
		
		Chaining4 obj = new Chaining4(60);
		obj.demo(40);
		
	}
}
