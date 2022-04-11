package Wrapper_Classes;

public class Unboxing {
//1) Unboxing is process of converting non-primitive data-type  into primitive data-type
	//we can perform unboxing process with help of non-static  method called value() present inside a wrapper class
	public static void main(String[] args) {
		
		Integer a = 30;			// object creation
		int b = a.intValue();
	System.out.println(a);
	System.err.println(b);
	
	System.out.println("*********************************************");	
		
	Character c='T';
		char p = c.charValue();
		System.out.println(c);
		System.err.println(p);
	
		System.out.println("*********************************************");	
		
		Boolean d=true;
		boolean e = d.booleanValue();
		System.out.println(d);
		System.err.println(e);
	
		System.out.println("*********************************************");	
// 2)Auto-unboxing is process of Converting same non-primitive data-types to Primitive data-types 
		
		Integer f=50;			// object creation
		int g =f;					//conversion  done Automatically
		System.out.println(f);
		System.err.println(g);
		
		System.out.println("*********************************************");	
		
		Boolean h = true;
		boolean i = h;
		System.out.println(i);
		System.err.println(h);
		
		System.out.println("*********************************************");	
		
// 3) String to primitive data-type
		String s1 = "10";
		int j = Integer.parseInt(s1);
		int n1 = Integer.valueOf(s1);
		
		System.out.println(s1);
		System.out.println(j);
		System.out.println(n1);
		
		
	}
}

