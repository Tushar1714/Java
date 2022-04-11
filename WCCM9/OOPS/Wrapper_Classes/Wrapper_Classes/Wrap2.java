package Wrapper_Classes;

public class Wrap2 {
// boxing and autoBoxing (Primitive to NonPremetive Datatype)
	public static void main(String[] args) {
	 // 1) we can perform boxing using valueOf() method
		int n=50;
		Integer m=Integer.valueOf(n);
		System.out.println(m);
		System.out.println(n);
		System.out.println("*******************************************");
		String a = String.valueOf(n);
		System.out.println(a);
		System.out.println(n);
		System.out.println("*******************************************");
		Character b = Character.valueOf((char) n);
		System.out.println(b);
		System.out.println(n);
		System.out.println("*******************************************");
		Float c = Float.valueOf(n);
		System.out.println(c);
		System.out.println(n);
		System.out.println("*******************************************");
		Double d = Double.valueOf(n);
		System.out.println(d);
		System.out.println(n);
		System.out.println("*******************************************");
		Byte e = Byte.valueOf((byte) n);
		System.out.println(e);
		System.out.println(n);
		System.out.println("*******************************************");
		Long f = Long.valueOf(n);
		System.out.println(f);
		System.out.println(n);
		System.out.println("*******************************************");
		Short g = Short.valueOf((short)n);
		System.out.println(g);
		System.out.println(n);
		System.out.println("*******************************************");
		
		//2) AutoBoxing
		//note: we can do Autoboxing only when both the primitive and nonpremitive datatype  is same
		int o = 10;
		Integer p =o;		//AutoBoxing
		System.out.println(o);
		System.out.println(p);
		
	}
	
}
