package ThreadPackage;

public class MainThread {

	public static void main(String[] args) {
//		Mythread1 m1 = new Mythread1();
//		m1.start();
//		Mythread2 m2 = new Mythread2();
//		m2.start();
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Tushar");
		System.out.println(Thread.currentThread().getName());
		System.out.println(10/0);
	}
}
