class Animal
{ 
	String color;
	int age ;
    void eat()
    {
    	
    	System.out.println("eating...");
    }  
    public void run() 
    {
    	System.out.println("running...");
    }
    public static void main(String[] args ) {
    	System.out.println("1");
    	Animal dog = new Animal();
    	dog.eat(); dog.run();
    	
    	Birds sp = new Birds();
    	sp.fly();
    	dog.color="black";
    	dog.age=10;
    	System.out.println(dog.color+" "+dog.age);
    }
 
}
    class Birds
    {
    	void fly()
    	{
    		System.out.println("bird is flying");
    	}
    }
    //there are 5 ways to create an object 
    //1)by using new keyword 
    //2)newInstanc() method
    //3)clone() method
    //4) deserialization
    //5)fatory method
    
    //1)declaration -: classname object name; eg ; animal obj
    //2) instantiation and initialization  :- object name  = new classname() ; eg; obj = new animal;

   

