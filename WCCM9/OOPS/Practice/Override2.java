package Practice;

public class Override2 extends Override1{

	public String demo() throws RuntimeException
	{
		System.out.println("2");
		return null;
		
	}
	public static void main(String[] args) {
		
		Override2 obj = new Override2();
		Override1 obj1 = new Override1();
		obj.demo();
		obj1.demo();
		
	
	}
}
