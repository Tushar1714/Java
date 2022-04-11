package OOPs;

public class AssociationB {
	void test()
	{
		System.out.println("Association class 2");
	}
	public static void main(String[] args) {
		AssoiciationA obj = new AssoiciationA();
		obj.demo();
		//obj.test(); 		gives error
		
		AssociationB obj2 = new AssociationB();
		//obj2.demo();				gives error because it is association(has a relationship)not coupled tightly
		obj2.test();
	}

}
