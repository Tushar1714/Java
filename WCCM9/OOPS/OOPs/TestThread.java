package OOPs;

public class TestThread extends Thread {

	public void run()
	{
		System.out.println("Thread Task");
	}
	public static void main(String[] args) {
		TestThread t = new TestThread();
		t.start();
		
		
	}
}
