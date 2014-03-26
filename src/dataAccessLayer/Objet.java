package dataAccessLayer;

public class Objet {

	private int id;
	private String details;
	
	public Objet(int id, String details) {
		super();
		this.id = id;
		this.details = details;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	

}
