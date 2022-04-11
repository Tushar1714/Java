package Practice;

public class IC1 implements I1{

	public void demo() {
		System.out.println("i am in overridden method");
	}
	public static void main(String[] args) {
		
		IC1 obj = new IC1();
		I1 obj1 = (I1) obj;
		obj1.demo();
		obj1.test();
		I1.display();
	}
}
