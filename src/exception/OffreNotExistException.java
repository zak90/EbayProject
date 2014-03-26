package exception;

public class OffreNotExistException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7045104991885898789L;

	public OffreNotExistException(){}
	
	public String getMessage(){
	
	return "This bid no longer exists";
	}

}
