package exception;

public class MyCustomException extends Exception {
	public MyCustomException(){
		super();
	}

	public MyCustomException(String message) {		
		super(message);
	}
}
