package OOPs;

public class Iclass implements I1 {

	public static void main(String[] args) {
		Iclass obj = new Iclass();
obj.show();
I1 obj1 = obj;

	}

	public void show()
	{
		System.out.println("1");
	}
}
