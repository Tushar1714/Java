package ThreadPackage;

import java.util.Iterator;

public class sleepThread extends Thread {

	public void run()
	{
		try {
		for (int i = 0; i <= 5; i++) {
			sleep(2000);
			System.out.println(i);
		}
		}
	catch (Exception e) {
		System.out.println(e);
	}
	}
	public static void main(String[] args) {
		System.out.println("Main Thread");
		sleepThread sl = new sleepThread();
		sl.start();
	}
}
