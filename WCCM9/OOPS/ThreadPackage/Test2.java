package ThreadPackage;

public class Test2 extends Thread {

	public void run()
	{
		System.out.println("Thread Task");
	}
	public static void main(String[] args) {
		
		Test2 t1 = new Test2();
		t1.start();
		Test2 t2 = new Test2();// Performing multiple from single Thread
		t2.start();
	}

}
