package OOPs;

public class CustomExceptions extends Exception {
// eg for Cheaked Exception
	
	CustomExceptions() {					//Default Exception Handler
		super();
	}
	CustomExceptions(String messege){
		super(messege);
	}
}
