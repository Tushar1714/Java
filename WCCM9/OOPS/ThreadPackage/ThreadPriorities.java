package ThreadPackage;

public class ThreadPriorities extends Thread {

	public void run() {

		System.out.println("Child Thread");
		System.out.println(Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
	
		System.out.println("Main Thread");
		Thread.currentThread().setPriority(7);
		System.out.println(Thread.currentThread().getPriority());
		ThreadPriorities t = new ThreadPriorities();
		t.start();
		t.setPriority(MAX_PRIORITY);
		System.out.println(Thread.currentThread().getPriority());
		

	}

}
