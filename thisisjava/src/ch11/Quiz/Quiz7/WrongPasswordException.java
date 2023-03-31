package ch11.Quiz.Quiz7;

public class WrongPasswordException extends Exception {

	public WrongPasswordException() {
		
	}
	
	public WrongPasswordException(String message) {
		//답
		super(message);
	}
	
}
