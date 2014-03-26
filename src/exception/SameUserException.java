package exception;

public class SameUserException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1173161957375994681L;
	public SameUserException(){}
	
	public String getMessage(){
	
	return "You can't buy what you sell";
	}


}
