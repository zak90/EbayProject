package dataAccessLayer;

import enums.OffreEnum;

public class Offre {
		private Buyer buyer;
		private float prix;
		private OffreEnum etat;
		
		public Offre(){
			this.prix=0;
		}
		
		public Offre(Buyer buyer, float prix) {
			super();
			this.buyer = buyer;
			this.prix = prix;
		}
		
		
		public OffreEnum getEtat() {
			return etat;
		}

		public void setEtat(OffreEnum etat) {
			this.etat = etat;
		}

		public Buyer getBuyer() {
			return buyer;
		}
		
		public void setBuyer(Buyer buyer) {
			this.buyer = buyer;
		}
		public float getPrix() {
			return prix;
		}
		public void setPrix(float prix) {
			this.prix = prix;
		}
		
}
