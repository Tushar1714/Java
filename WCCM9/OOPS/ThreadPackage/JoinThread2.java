package ThreadPackage;

public class JoinThread2 extends Thread {

	static Thread mainThread;
	public void run() {
		
		try {
			mainThread.join();
			for (int i = 0; i <=5; i++) {
				System.out.println("Child Thread :"+i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		
		JoinThread2 j2 = new JoinThread2();
		mainThread = Thread.currentThread(); //Very Important step
		j2.start();
		
		try {
			
			for (int i = 0; i <=5; i++) {
				System.out.println("Main Thread :"+i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
