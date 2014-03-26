package alerte;

import dataAccessLayer.Buyer;

public class Subscription {
			
		
		private boolean supOffer;
		private boolean cancelOffer;
		private boolean prixOffer;
		
		
		
		public Subscription(boolean supOffer, boolean cancelOffer,
				boolean prixOffer) {
			super();
			
			this.supOffer = supOffer;
			this.cancelOffer = cancelOffer;
			this.prixOffer = prixOffer;
		}
		
	
		public boolean isSupOffer() {
			return supOffer;
		}
		public void setSupOffer(boolean supOffer) {
			this.supOffer = supOffer;
		}
		public boolean isCancelOffer() {
			return cancelOffer;
		}
		public void setCancelOffer(boolean cancelOffer) {
			this.cancelOffer = cancelOffer;
		}
		public boolean isPrixOffer() {
			return prixOffer;
		}
		public void setPrixOffer(boolean prixOffer) {
			this.prixOffer = prixOffer;
		}
		
			
}
