class Batch
{
	String Student_Name;
	int Roll_no;
	double Fees_Paid;
	
	Batch()
	{
		
	}
	Batch( String Sname,int S_roll_No,double paid_fees )

	{
		this.Student_Name=Sname;
		this.Roll_no=S_roll_No;
		this.Fees_Paid=paid_fees;
	}
		public void batch1()
	{
		System.out.println(Student_Name+"is in Batch1");

	}
	public void details()
	{
		System.out.println("Student_Name: "+Student_Name);
		System.out.println("Roll_no: "+Roll_no);
		System.out.println("Fess_Paid: "+ Fees_Paid);

		
	}

	}
