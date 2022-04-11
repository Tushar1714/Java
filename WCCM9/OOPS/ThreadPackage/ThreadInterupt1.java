package ThreadPackage;

public class ThreadInterupt1 extends Thread{
	public void run() {
	try {
		for (int i = 0; i <=5; i++) 
		{
			sleep(1000);
			System.out.println(Thread.currentThread().getName()+ ": "+i);
		}
	} 
	catch (Exception e) {
		System.out.println("Thread Interupted :"+e);
		}
}
	public static void main(String[] args) {
		ThreadInterupt1 t = new ThreadInterupt1();
		t.start();
		t.interrupt(); 
	}
	
}
