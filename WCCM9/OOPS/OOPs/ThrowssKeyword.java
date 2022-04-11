package OOPs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


public class ThrowssKeyword {

	void readFile()   throws FileNotFoundException
	{
		FileInputStream fis = new FileInputStream("d:/abc.txt");
	}
	void saveFile()  throws FileNotFoundException
	{
		FileOutputStream fos = new FileOutputStream("d:/xyz.txt");
	}
}
