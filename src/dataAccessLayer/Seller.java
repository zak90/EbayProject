package dataAccessLayer;

import java.util.ArrayList;
import java.util.Date;

import alerte.Alert;
import enums.EnchereState;
import exception.OffreNotExistException;
import exception.PriceExceedException;

public class Seller extends User {
	
	private ArrayList<Enchere> listEnchere = new ArrayList<Enchere>();
	private Alert alerte;
	
	public Seller(){
		super();
	}
	
	public ArrayList<Enchere> getListEnchere() {
		return listEnchere;
	}

	public void setListEnchere(ArrayList<Enchere> listEnchere) {
		this.listEnchere = listEnchere;
	}
	
	public Enchere creerEnchere(int id,String details,float minPrix,float resPrix,int nH)
	{
		Objet obj = new Objet(id,details);
		Enchere enchere = new Enchere(this,obj,minPrix,resPrix);
		this.listEnchere.add(enchere);
		enchere.setEtat(EnchereState.Crée);
		return enchere;
	}

	public void pubEnchere(Enchere enchere) throws OffreNotExistException{
		if (enchere != null)
		enchere.setEtat(EnchereState.Publiée);
		else {
			throw new OffreNotExistException();
		}
	}
	public void annEnchere(Enchere enchere) throws PriceExceedException{
		if(enchere.getOffres().isEmpty())
		{this.listEnchere.remove(enchere);
		enchere.setEtat(EnchereState.Annulée);
		}
		else {
			throw new PriceExceedException();
		}
	}
	
	public boolean resPrix (Enchere enchere)
	{
		if(this.alerte.prixOffer(enchere)==true)
			return true;
		
		return false;
	}
	
	
	
	
	
	
	}

	
	
	






