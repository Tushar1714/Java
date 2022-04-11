package ThreadPackage;

import java.util.Iterator;

public class JoinThread1 extends Thread {
	public void run()
	{
		try {
			for (int i =1; i <=5; i++) {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+": "+ i);
			}
		} catch (Exception e) {
		System.out.println(e);
		}
		
	}
	public static void main(String[] args) {
		JoinThread1 j1 =  new JoinThread1();
		j1.start();
		
		try {j1.join();
			for (int i =1; i <=5; i++) {
			System.out.println(Thread.currentThread().getName()+ ": "+ i);
			Thread.sleep(1000);
			}    
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
