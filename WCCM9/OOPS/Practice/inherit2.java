package Practice;

public class inherit2 extends Inherit1 {

	static int b =50;
	static 
	{
		System.out.println("This is Static Block 2");
	}
 public static void main(String[] args) {
	// static members of parent class do not get memory inside child class we only can access them
	 inherit2 obj = new inherit2();
	 obj.test();		//static member of parent class can be accessed through object of child class also
	 System.out.println(b);
	 System.out.println(obj.a);		//static member of parent class can be accessed using object ref. var. also
	 System.out.println(inherit2.a);	//static member of parent class can be accessed using chid class name as a ref. also 
	 
}
}
