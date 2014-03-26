package dataAccessLayer;

import java.util.ArrayList;
import java.util.Date;

import alerte.Subscription;
import enums.EnchereState;

public class Enchere {

	private Seller seller;
	private Objet objet;
	private EnchereState etat;
	private Date limite;
	private float prix_min;
	private float prix_res;
	private ArrayList<Offre> offres;
	private ArrayList<Subscription> sub ;
	
	


	public Enchere(Seller seller, Objet objet, EnchereState etat, Date limite,
			float prix_min, float prix_res, ArrayList<Offre> offres,
			ArrayList<Subscription> sub) {
		super();
		this.seller = seller;
		this.objet = objet;
		this.etat = etat;
		this.limite = limite;
		this.prix_min = prix_min;
		this.prix_res = prix_res;
		this.offres = offres;
		this.sub = sub;
	}


	public Enchere(Seller seller, Objet objet, EnchereState etat, Date limite,
			float prix_min, ArrayList<Offre> offres) {
		super();
		this.seller = seller;
		this.objet = objet;
		this.etat = etat;
		this.limite = limite;
		this.prix_min = prix_min;
		this.offres = offres;
	}
	

	public Enchere(Seller seller, Objet objet, Date limite, float prix_min,float prix_res) {
		super();
		this.seller = seller;
		this.objet = objet;
		this.limite = limite;
		this.prix_min = prix_min;
		this.prix_res = prix_res;
	}



	public Enchere(Seller seller, Objet objet, float prix_min, float prix_res) {
		super();
		this.seller = seller;
		this.objet = objet;
		this.prix_min = prix_min;
		this.prix_res = prix_res;
	}


	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	public Objet getObjet() {
		return objet;
	}

	public void setObjet(Objet objet) {
		this.objet = objet;
	}

	public EnchereState getEtat() {
		return etat;
	}

	public void setEtat(EnchereState etat) {
		this.etat = etat;
	}

	public Date getLimite() {
		return limite;
	}

	public void setLimite(Date limite) {
		this.limite = limite;
	}

	public float getPrix_min() {
		return prix_min;
	}

	public float getPrix_res() {
		return prix_res;
	}
	
	public void setPrix_min(int prix_min) {
		this.prix_min = prix_min;
	}

	public ArrayList<Offre> getOffres() {
		return offres;
	}

	public void setOffres(ArrayList<Offre> offres) {
		this.offres = offres;
	}
	

	public ArrayList<Subscription> getSub() {
		return sub;
	}


	public void setSub(ArrayList<Subscription> sub) {
		this.sub = sub;
	}


	public void setPrix_min(float prix_min) {
		this.prix_min = prix_min;
	}


	public void setPrix_res(float prix_res) {
		this.prix_res = prix_res;
	}

	
	
}
