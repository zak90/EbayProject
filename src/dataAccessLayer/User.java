package dataAccessLayer;

public class User {

	// Attribut
		private String nom;
		private String prenom;
		private String mail;
		private String number;
	
		//Constructeur par défaut
		public User(){
			this.nom = null;
			this.prenom = null;
			this.mail = null;
			this.number = null;
		}
		
		//Constructeur avec paramètres
		public User(String nom, String prenom, String mail, String number) {
			super();
			this.nom = nom;
			this.prenom = prenom;
			this.mail = mail;
			this.number = number;
		}
		
		//Getter et Setter
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		public String getMail() {
			return mail;
		}
		public void setMail(String mail) {
			this.mail = mail;
		}
		public String getNumber() {
			return number;
		}
		public void setNumber(String number) {
			this.number = number;
		}
		
		
}
