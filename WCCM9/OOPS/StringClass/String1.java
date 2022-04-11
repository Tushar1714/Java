package StringClass;

public class String1 {

	public static void main(String[] args) {
		
	String s1 = "hi";			// using assignment operator Object created in String Constant pool
	String s2 = "hi";			//SCP does not allow duplicate objects it will replace value with same Address
	String s3 = new String("hi");		// using new keyword Object created in Heap area
	String s4 = new String("hi");
			
			System.out.println(s1==s2);		 //Same Address
			System.out.println(s1==s3);		//Different Address
		System.out.println(s1==s4);
			System.out.println(s2==s3);
			System.out.println(s2==s4);
			System.out.println(s3==s4);		//Different Address 
			
System.out.println("--------------------------------------------------------------------------------");
			
// equals() and equalsIgnoreCase()  methods
System.out.println(" equals() and equalsIgnoreCase()  methods");
			String s5 ="Hello";
			String s6 = "hello";
			System.out.println(s5.equals(s6));		// compares value present inside two objects
			System.out.println(s5.equalsIgnoreCase(s6)); // ignores Case sensitiveness
		
System.out.println("--------------------------------------------------------------------------------");
	System.out.println("charAt Method");	
	String s7 = "Tushar";
	System.out.println(s7.charAt(3)); 	// Returns Character At Specified index value
	
	System.out.println("--------------------------------------------------------------------------------");
	System.out.println("codePointAt() Method");
	System.out.println(s7.codePointAt(3)); 	// returns unicode (ascii value) of the character At Specified Index
	
System.out.println("--------------------------------------------------------------------------------");
System.out.println("codePointBefore() Method");
	System.out.println(s7.codePointBefore(4));	 	// returns unicode of the character Before the Specified Index
	
	System.out.println("--------------------------------------------------------------------------------");
	System.out.println("codePointCount() method");
	String s8 = "mastek";
	System.out.println(s8.codePointCount(0,s8.length()));
	System.out.println(s8.codePointCount(1,3)); 		//returns no of values found between specified index
	
System.out.println("--------------------------------------------------------------------------------");
	System.out.println("compareTo() method");
	String s9 = "Mastekxyz";
	System.out.println(s8.compareTo(s9));	// compare values present inside  string lexicographically(different characters)

System.out.println("--------------------------------------------------------------------------------");
	System.out.println("compareToIgnoreCase() Method");
	System.out.println(s9.compareToIgnoreCase(s8)); // ignores case sensitivity and compare lexicographically
	System.out.println(s9.compareToIgnoreCase(s9));

System.out.println("--------------------------------------------------------------------------------");
	System.out.println("concat() Method");
	String s10 = "tushar";
	String s11 = "patil";
	System.out.println(s10.concat(s11));	//concat or merge Second string to the end of the first string
	
System.out.println("--------------------------------------------------------------------------------");
	System.out.println("contains() Method");
	System.out.println(s10.contains("ush"));		//checks Whether string contains Specified charSequence or not
	System.out.println(s10.contains("pat"));
	
System.out.println("--------------------------------------------------------------------------------");
	System.out.println("containsEqual() Method");
	System.out.println(s10.contentEquals("tushar"));	//check whether string contains exact charSequence and exact no of Characters
	System.out.println(s10.contentEquals("ush"));

System.out.println("--------------------------------------------------------------------------------");
	System.out.println("copyValueOf() Method");
	char[] s12= {'h','e','l','l','o'};
	String s13 = "";
	System.out.println(s13.copyValueOf(s12, 0, 5));
	System.out.println(s13.copyValueOf(s12));

System.out.println("--------------------------------------------------------------------------------");
	System.out.println("endsWith() Method");
	String s14 = "tushar";		//check whether string ends with specified charSequence
	System.out.println(s14.endsWith("ar"));
	
System.out.println("--------------------------------------------------------------------------------");
	System.out.println("hashCode() Method");
	System.out.println(s14.hashCode()); //returns hashCode of given string(mutiplication of asci values)

System.out.println("--------------------------------------------------------------------------------");
	System.out.println("indexOf() Method");
	System.out.println(s14.indexOf('h'));  // returns position of first found occurrence given specified character
	
System.out.println("--------------------------------------------------------------------------------");
	System.out.println("isEmpty() Method");
	String s15 = "Patilp";
	System.out.println(s15.isEmpty());	//returns true if string is empty
	System.out.println(s15.isBlank());
	
System.out.println("--------------------------------------------------------------------------------");
	String s16 = "Helloo";
	System.out.println("lastIndexOf() Method");
	System.out.println(s16.lastIndexOf('l')); //returns last index of occurrence of given specified character
	
System.out.println("--------------------------------------------------------------------------------");
	System.out.println("length() Method");
	System.out.println(s16.length()); 	//returns length of specified string
	
System.out.println("--------------------------------------------------------------------------------");
	System.out.println("replace() Method");
	System.out.println(s16.replace('l', 'd'));	//search all the specified char and replace it with given char

System.out.println("--------------------------------------------------------------------------------");
	System.out.println("replaceFirst() Method");
	String s17 = "Tusushar";
	System.out.println(s17.replaceFirst("us","ut"));		//replaces first occurrence of given substring that matches given substring 
	
System.out.println("--------------------------------------------------------------------------------");
	System.out.println("replaceAll() Mthod");
	System.out.println(s17.replaceAll("us","ut"));	//replaces given substring with all occurrence of specified substring
	
System.out.println("--------------------------------------------------------------------------------");
	System.out.println("subSequence() Method");
	System.out.println(s17.subSequence(1,5));	//returns a new charSequence that is subsequence of given specified subsequence
	
System.out.println("--------------------------------------------------------------------------------");
	System.out.println("substring() Method");
	System.out.println(s17.substring(4));	//returns substring from given specified index value or between index value
	System.out.println(s17.substring(2, 5));
	
System.out.println("--------------------------------------------------------------------------------");
	System.out.println("toCharArray() Method");
	String s18 = "  Tushar  ";
	System.out.println(s18.toCharArray());	//convert the given string into new character Array

System.out.println("--------------------------------------------------------------------------------");
	System.out.println("trim() Method");
	System.out.println(s18.trim());	//remove whitespace around string at both ends
	
System.out.println("--------------------------------------------------------------------------------");
	System.out.println("toLowercase() Method");
	System.out.println(s18.toLowerCase());
	
System.out.println("--------------------------------------------------------------------------------");
	System.out.println("toString() Method");
	String s19 = "TusharPatil";
	System.out.println(s19.toString());	//returns value present inside string

System.out.println("--------------------------------------------------------------------------------");
	System.out.println("toUpperCase() Method");
	System.out.println(s19.toUpperCase());	//Converts the string to UpperCase letters
	
System.out.println("--------------------------------------------------------------------------------");

	}
}
