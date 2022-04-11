package OOPs;

public class SuperKeyword2 extends SuperKeyword {
//1)
	/*int a= 20;
void test(int a)
{
	System.out.println(a);
	System.out.println(this.a);
	System.out.println(super.a);   
}*/
	public static void main(String[] args) {

	/*1)
		SuperKeyword2 obj = new SuperKeyword2();
obj.test(30); 
	}*/
	

/*2)
		SuperKeyword2 obj = new SuperKeyword2();
		obj.show();
}
void show()
{
	super.m1();
} 
*/
	
	/*3)
		SuperKeyword2 obj = new SuperKeyword2();
	}
	SuperKeyword2()
	{
		super();		// in case of constructors  if programmer fails to add super keyword  then it added by compiler automatically
		System.out.println("i am in child class");
	}
	*/
}
