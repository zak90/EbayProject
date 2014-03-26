package alerte;

import java.util.List;

import dataAccessLayer.Enchere;
import dataAccessLayer.Offre;
import enums.EnchereState;
import enums.OffreEnum;

public class Alert {
		
		public boolean canceledEnchere(Enchere enchere)
		{
			if(enchere.getEtat()==EnchereState.Annul�e)
			{
			for(Subscription sub : enchere.getSub())
			{
			return true;	
			}
		}
			return false;
			
		}
		
		public boolean finishedEnchere(Enchere enchere)
		{
			if(enchere.getEtat() == EnchereState.Termin�e)
			{
				for(Subscription sub : enchere.getSub())
					return true;
			}
			
			return false;
			
		}
		
		public boolean SupOffer(Enchere enchere){
			for(Offre offre : enchere.getOffres())
			{
				for(Subscription sub : enchere.getSub())
				{
					if(offre.getEtat()==OffreEnum.D�pass�)
						return true;
				}
			}
			return false;
		}
		
		public boolean prixOffer(Enchere enchere)
		{
			for(Offre offre : enchere.getOffres())
			{
				for(Subscription sub : enchere.getSub())
				{
					if(offre.getEtat()==OffreEnum.ResExceed)
						return true;
				}
			}
			return false;
			
		}
		
}
