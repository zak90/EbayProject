package exception;

public class PriceExceedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public PriceExceedException(){}
	
	public String getMessage(){
	
	return "You can't cancel the bid , the res_price is reached";
	}


}
