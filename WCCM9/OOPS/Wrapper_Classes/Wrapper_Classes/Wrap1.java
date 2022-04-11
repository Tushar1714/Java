package Wrapper_Classes;

public final class  Wrap1 {

	public static void main(String[] args) {
		
		Integer n=12;						//Object creation using Assignment Operator
		Integer m = new Integer(20);		//Object creation Using new keyword
		System.out.println(m);				//toString(),equals() and hashCode() methods are automatically Overridden here from object class
		System.out.println(n.toString());
	}

}
