package exception;

public class NoLongerException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 303631083267605469L;

public NoLongerException(){}
	
	public String getMessage(){
	
	return "This bid no longer exists";
	}

}
