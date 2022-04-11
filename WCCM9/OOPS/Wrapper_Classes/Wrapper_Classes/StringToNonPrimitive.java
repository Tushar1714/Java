package Wrapper_Classes;
class StringToNonPrimitive 
{
	public static void main(String[] args) 
	{
		byte a=1;
		String S1=String.valueOf(a);
		System.out.println(a);
		System.out.println(S1);

		short b=2;
		String S2= String.valueOf(b);
		System.out.println(b);
		System.out.println(S1);

		int c=3;
		String S3= String.valueOf(c);
		System.out.println(c);
		System.out.println(S3);

		long d=4;
		String S4= String.valueOf(d);
		System.out.println(d);
		System.out.println(S4);

		float e=5.67f;
		String S5= String.valueOf(e);
		System.out.println(e);
		System.out.println(S5);
			
		double f=6;
		String S6= String.valueOf(f);
		System.out.println(f);
		System.out.println(S6);

		char g='x';
		String S7= String.valueOf(g);
		System.out.println(g);
		System.out.println(S7);

		boolean h=false;
		String S8= String.valueOf(h);
		System.out.println(h);
		System.out.println(S8);

	}
}
