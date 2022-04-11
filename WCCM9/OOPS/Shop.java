class Shop 
{
	public static void main(String[] args) 
	{
		
		Laptop L1=new Laptop("HP", "14S_er0003tu", 70599,74837);
	    Laptop L2=new Laptop("Asus", "15Me456", 53295,87378);
		Laptop L3=new Laptop("Lenovo", "TYU15x", 55999, 43857);
		Laptop L4=new Laptop("Dell", "TP413tb", 79999,39599);

		System.out.println(L1.getSerial_No());


		L1.details();
		L2.details();
		L3.details();
		L3.details();

       }
	   

}
