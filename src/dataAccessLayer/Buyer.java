package dataAccessLayer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import alerte.Alert;
import enums.EnchereState;
import enums.OffreEnum;
import exception.NoLongerException;
import exception.PriceNotReachedException;
import exception.SameUserException;

public class Buyer extends User {

	

	private OffreEnum etat;
	private Alert alerte;
	
	public OffreEnum getEtat() {
		return etat;
	}

	public void setEtat(OffreEnum etat) {
		this.etat = etat;
	}

	public Buyer() {
		super();
	}
	
	public Offre depotOffre(Enchere enchere, float prix) throws PriceNotReachedException, NoLongerException, SameUserException
	{
			if(prix <= enchere.getPrix_min())
			{
				throw new PriceNotReachedException();
			}
			else if (enchere.getSeller().equals(this))
			{
				throw new SameUserException();
			}
			else if(enchere.getEtat() == EnchereState.Annulée || enchere.getEtat()== EnchereState.Terminée)
			{
				throw new NoLongerException();
				
			}
			else if(enchere != null && enchere.getEtat()== EnchereState.Publiée)
			{
				Offre offre = new Offre(this,prix);
				enchere.getOffres().add(offre);
				return offre;
			}
			return null;
	}
	
	public boolean offreSup(Enchere enchere){
		
		if(this.alerte.prixOffer(enchere)==true)
		{
			for(Offre offre : enchere.getOffres())
			{
				offre.setEtat(OffreEnum.Dépassé);
				return true;
			}
			}
		return false;
	}
	
}
