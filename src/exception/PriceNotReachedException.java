package exception;

public class PriceNotReachedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4693082042810278564L;

public PriceNotReachedException(){}
	
	public String getMessage(){
	
	return "The res_prix is not reached";
	}

}
