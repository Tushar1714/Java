package ThreadPackage;

public class Threadmethods extends Thread {

	public void run()
	{
		System.out.println("Thread Task"+": "+Thread.currentThread().getName());
		//Thread.currentThread().setName("Tushar");
		//System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {

		Threadmethods t = new Threadmethods();
		System.out.println(Thread.currentThread().getName());
		t.start();
		Threadmethods t2 = new Threadmethods();
		t2.start();
	}

}
