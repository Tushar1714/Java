package ThreadPackage;

import java.util.Iterator;

public class SleepThread2 extends Thread {


	public void run() {
		
		 for (int i =1; i <=5; i++) {
			try {
				sleep(1000);
				System.out.println(Thread.currentThread().getName()+": "+i);
			} catch (Exception e) {
			System.out.println(e);
			}

		}
	}
	public static void main(String[] args) {
		SleepThread2 sl2 = new SleepThread2();
		for (int i =1; i <=5; i++) {
			try{
				sleep(1000);
			System.out.println(Thread.currentThread().getName()+": "+i);
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
		sl2.start();
	}
}
