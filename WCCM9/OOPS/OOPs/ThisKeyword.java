package OOPs;

public class ThisKeyword {
//uses of this keyword
	/*1)to invoke current class instatnce(global) variable
	int i;
	void setI(int i) {
		this.i=i;
	}
	void getI() {
		System.out.println(i);
	}*/
	
/*	2)can be used to invoke current class method(implicitily)
	void display()
	{
		System.out.println("hello");
	}
	void show()
	{
		this.display(); // here, if programer fails to add this keyword then compilar will automatically add this keyword. 
	} */
	
	/* 3) this() can be used to invoke current class constructor
	ThisKeyword(){
		System.out.println("No Argument Constructor");
	}
	ThisKeyword(int a){
		this();    // here this() will invoke no args constructor
		System.out.println("Argument constructor");
	}*/
	
	/*4) can be used to pass an argument in the method call
	void m1(ThisKeyword obj)
	{
		System.out.println("i am in m1 method");
	}
	void m2()
	{
		m1(this);
	}*/
	
	
	/*5)this keyword can be used to pass an argument in the constructor call
	ThisKeyword(ThisKeyword2 obj)
	{
		System.out.println("test class constructor");
	}*/
}
