package ch7;

//사용자 정의 예외 작성

public class MyException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyException() { //default constructor
		super();
	}

	public MyException(String message) { //String constructor
		super(message);
	}
	
}
