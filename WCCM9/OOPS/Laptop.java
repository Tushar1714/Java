class Laptop 
{
	String Laptop_Brand;
	String Laptop_Model;
	int  Price;
  private  double Serial_No;

  //Getter Method For Serial NO
  public double getSerial_No()
	{
		return Serial_No;
	}

	// Setter Method For Serial no
	public void  setSerial_No(double b)
	{
		this.Serial_No=b;
	}
	
		Laptop()
		{
		
		}
		Laptop(String brand, String model, int Lprice, double SRno)
	{
		this.Laptop_Brand=brand;
		this.Laptop_Model=model;
		this.Price=Lprice;
		this.Serial_No= SRno;
	}
	public void details()
	{
		System.out.println("Latop_Brand: "+Laptop_Brand);
		System.out.println("Laptop_Model: "+Laptop_Model);
		System.out.println("Price: "+ Price);
		System.out.println("Serial_No :"+Serial_No);
	
	}
	
}
