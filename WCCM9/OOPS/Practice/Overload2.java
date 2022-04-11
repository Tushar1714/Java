package Practice;

public class Overload2 {

	void demo()		//Overloading Method 
	{
		System.out.println("2");
	}
	public static void main(String[] args) {
		
		Overload2 obj = new Overload2();
		Overload1 obj1 = new Overload1();
		obj.demo();
		obj1.demo();
	}
}
