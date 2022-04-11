package Practice;

public class AbstractChild extends AbstractClass1 {

	public void demo()
	{
		System.out.println("I am in Overloaded method ");
	}
	public static void main(String[] args) {
		AbstractChild obj = new AbstractChild();
	//	obj.test();
		//AbstractClass1 obj1 = obj;
		 AbstractClass1 obj1 =(AbstractClass1) obj;
	}
}
