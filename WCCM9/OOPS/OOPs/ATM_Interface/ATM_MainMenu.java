package ATM_Interface;

import java.text.DecimalFormat;
import java.util.*;
import java.io.IOException;

public class ATM_MainMenu extends Account{
	
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

	HashMap<Integer , Integer> data = new HashMap <Integer , Integer>();
	
	public void getLogin() throws IOException
	{
		int x=1;
		do {
			try {
				data.put(907581, 818163);
				data.put(703022, 220678);
				data.put(923365, 744563);
				data.put(989076, 324356);
		
				System.out.println(" Welcome to the RBP ATM!");
				System.out.print(" Please Enter Yoour Account Number :");
				setCustomerNumber(menuInput.nextInt());
				System.out.print(" Enter your PIN Number :");
				setPinNumber(menuInput.nextInt());
			}
			catch(Exception e){
				System.out.println("\n" + " Invalid Characters(s). Only Numbers." + "\n");
				x=2;
			}
			int cn = getCustomerNumber();
			int pn = getPinNumber();
			if(data.containsKey(cn) && data.get(cn)==pn)
			{
				getAccountType();
			}
			else 
				System.out.println("\n" + " Wrong Cutomer Number or Pin Number" + "\n");
			}
		
			while(x==1);
		}
			
	public void getAccountType()
			{
				System.out.println("Select the Account you want to Access : ");
				System.out.println(" Press 1 - Current Account");
				System.out.println(" Press 2 - Saving Account");
				System.out.println(" Press 3 - Exit");
				
				int selection = menuInput.nextInt();
				
				switch(selection)
				{
				case 1 : getCurrent();
							break;
							
				case 2 : getSaving();
							break;
				
				case 3 : 
							System.out.println("Thank You for using this ATM.\n\n");
							break;
							
				default : 
							System.out.println("\n" + "Invalid Choice" + "\n");
							getAccountType();
				}
			}
			
	public void getCurrent()
			{
				System.out.println("Current Account : ");
				System.out.println(" Press 1 - View Balance");
				System.out.println(" Press 2 - Withdraw Funds");
				System.out.println(" Press 3 - Deposit Funds");
				System.out.println(" Press 4 - Exit");
				System.out.print(" Choice: ");
				
				int selection = menuInput.nextInt();
				
				switch(selection)
				{
				case 1 : 
							System.out.println("Current Account Balance : " + moneyFormat.format(getCurrentBalance()));
							getAccountType();
							break;
							
				case 2 :
							getCurrentWithdrawInput();
							getAccountType();
							break;
							
				case 3 :
							getCurrentDepositInput();
							getAccountType();
							break;
							
				case 4 : 
							System.out.println("Thank You for Using This ATM.");
							break;
				default :
							System.out.println("\n" + "Invalid Choice. " + "\n");
				}
			}
	public void getSaving()
			{
				System.out.println("Saving Account : ");
				System.out.println(" Press 1 - View Balance");
				System.out.println(" Press 2 - Withdraw Funds");
				System.out.println(" Press 3 - Deposit Funds");
				System.out.println(" Press 4 - Exit");
				System.out.print("Choice : ");
				
				int selection = menuInput.nextInt();
				
				switch (selection)
				{
				case 1 :
					System.out.println("SavingAccount Balance : " + moneyFormat.format(getSavingBalance()));
					getAccountType();
					break;
					
				case 2 : 
					getSavingWithdrawInput();
					getAccountType();
					break;
					
				case 3 : 
					getSavingDepositInput();
					getAccountType();
					break;
					
				case 4 : 
					System.out.println("Thank You for using this ATM");
					break;
					
				default :
					System.out.println("\n" + "Invalid Choice. " + "\n");
					getCurrent();
				}
			}
				
}
