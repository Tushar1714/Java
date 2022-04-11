package ThreadPackage;

public class YeildMethod1 extends Thread {

	public void run() {
		for (int i = 0; i <=5; i++) {
			
			System.out.println(Thread.currentThread().getName()+": " +i);
		}
	}
	public static void main(String[] args) {
		YeildMethod1 y = new YeildMethod1();
		y.start();
		try {
			
			for (int i = 0; i <=5; i++) {
				sleep(800);
				Thread.yield();
				System.out.println(Thread.currentThread().getName()+ ": "+i);
			
			}
		} 
		catch (Exception e) {
			System.out.println(e);
		}
	
}
}
