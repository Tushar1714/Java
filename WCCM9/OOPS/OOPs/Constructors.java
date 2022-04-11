package OOPs;

public class Constructors {
    String name;
    int emp_id;
	public Constructors(String n, int e) {
	
		this.name=n;
		this.emp_id= e;
	}
	public static void main(String[] args) {
		
		Constructors employee1 = new Constructors("tushar", 101);
		Constructors employee2= new Constructors("vijay", 102);
	}
}
