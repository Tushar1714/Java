package Practice;

public class Encapse4 {

	public static void main(String[] args) {
		 Encapse3 xlx = new Encapse3(1500,"cedan","Diesel");
		 System.out.println(xlx.carcc);
		 System.out.println(xlx.carType);
		 System.out.println(xlx.engineType);
		 System.out.println(xlx.getName());
		 System.out.println(xlx.getPrice());
		 xlx.setPrice(1150000);
		 System.out.println(xlx.getPrice());
		 
	}
}
