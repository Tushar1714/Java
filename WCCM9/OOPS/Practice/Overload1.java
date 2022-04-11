package Practice;

public class Overload1 {

	int main(float a) 		//Overloaded Method
	{
		System.out.println("1");
		return 0;
	}
String main(String a) 		//Overloaded Method
	{
		System.out.println("2");
		return null;
	}

	public static void main(String[] args) {
		
		Overload1 obj1 = new Overload1();
		obj1.main("tush");
		obj1.main(12.3f);
}
}