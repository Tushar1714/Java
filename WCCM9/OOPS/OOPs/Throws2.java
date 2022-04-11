package OOPs;

import java.io.FileNotFoundException;

public class Throws2
{

	public static void main(String[] args) {
		
		ThrowssKeyword tk = new ThrowssKeyword();
		
		try {
			tk.readFile();
		     }
		catch (FileNotFoundException e) {
			e.getStackTrace();
		}
		try {
			tk.saveFile();
		}
		catch (FileNotFoundException e) {
			e.getStackTrace();
		}
		System.out.println("thanks ");
	}
}
