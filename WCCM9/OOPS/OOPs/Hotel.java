class Hotel 
{
	public static void main(String[] args) 
	{
		Room R1= new Room(101);
		Room R2= new Room(102);
		Room R3= new Room(103);
		Room R4= new Room(104);
        
		System.out.println(R1.hashCode());
		System.out.println(R2.hashCode());
		System.out.println(R3.hashCode());
		System.out.println(R4.hashCode());
	}
}
