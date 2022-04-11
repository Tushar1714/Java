package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class List1 {

	public static void main(String[] args) {
	/*	ArrayList obj = new ArrayList();
		System.out.println(obj.isEmpty());
		System.out.println(obj);
		obj.add(1);
		obj.add(1.23);
		obj.add("tushar");
		obj.add(true);
		System.out.println(obj);
		System.out.println(obj.isEmpty());
		
		Vector obj1 = new Vector();
		Vector obj2 = new Vector();
		obj2.add(1);
		obj2.add(1.23);
		obj2.add("tushar");
		obj2.add(false);
		obj1.add(1);
		obj1.add(1.23);
		obj1.add("tushar");
		obj1.add(true);
		System.out.println(obj1);
		System.out.println(obj1.isEmpty());
		//obj1.add(obj2);
		//System.out.println(obj1);
		obj1.addAll(obj2);
		System.out.println(obj1);
		System.out.println(obj1.size());
		System.out.println(obj1.get(2));
		System.out.println(obj1.indexOf("tushar"));*/
		
		
		ArrayList<Integer> obj3 = new ArrayList<Integer>();
		obj3.add(1);
		obj3.add(3);
		obj3.add(56);
		obj3.add(2);
		obj3.add(4);
		obj3.add(23);
//		for (int i = 0; i < obj3.size(); i++) {
//			System.out.println(obj3.get(i));
		
	//	}
	Collections.sort(obj3);
	System.out.println(obj3);
	Collections.reverse(obj3);
	System.out.println(obj3);
	
	for (Object obj : obj3) {
		System.out.println();
	}
	
	}
}
