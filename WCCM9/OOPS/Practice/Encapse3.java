package Practice;

public class Encapse3 {

	
	private String carName="Tata_Punch";
	private double price = 1050000;
	int carcc;
	String carType;
	String engineType;
	
Encapse3(){
		
	}
	Encapse3(int carcc,String carType,	String engineType)
	{
		this.carcc = carcc;
		this.carType=carType;
		this.engineType = engineType;
	}
	public  void setName(String carName)
	{
		this.carName = carName;
	}
	public String getName()
	{
		return carName;
	}
	public  void setPrice(double carPrice)
	{
		this.price = carPrice;
	}
	public double getPrice()
	{
		return price;
	}
	public static void main(String[] args) {
		
	}
}
