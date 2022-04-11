package Practice;

public class Encapse2 {

	public static void main(String[] args) {
		
		Encapse1 obj = new Encapse1("Tushar Patil","D101");
		System.out.println(obj.dept);
		System.out.println(obj.ename);
	//	System.out.println(obj.sal);
		System.out.println(obj.getsal());
		obj.setsal(60000);
		System.out.println(obj.getsal());
	}
}
