package ATM_Interface;

import java.io.IOException;
public class ATM  extends ATM_MainMenu{
	
	public static void main(String[] args) throws IOException
	{
		ATM_MainMenu mainMenu = new ATM_MainMenu();
		
		mainMenu.getLogin();
	}

}
