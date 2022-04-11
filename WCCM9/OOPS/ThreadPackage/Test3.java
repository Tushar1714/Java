package ThreadPackage;

public class Test3 implements Runnable {
@Override
	public void run()
	{
		System.out.println("Thread Taks");
	}
	public static void main(String[] args) {
	 
		Test3 th = new Test3();
		Thread thh = new Thread(th);
		thh.start();

	}

}
