package Practice;

public class Encapse1 {
	
	String ename;
	private int sal=50000;
	String dept;
	
	Encapse1()
	{
		
	}
	Encapse1(String ename,String dept )
	{
		this.ename = ename;
		this.dept = dept;
	}
	public void setsal(int x)
	{
		this.sal = x;
	}
	public int getsal()
	{
		return sal;
	}
	

	
}
