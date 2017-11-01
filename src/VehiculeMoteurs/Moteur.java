package VehiculeMoteurs;

import VehiculeMarque.Vehicule;

public abstract class Moteur {
	private String cylindre;
	private double prix;
	protected TypeMoteur type;
	
	public Moteur(String cylindre, double prix) {
		this.cylindre = cylindre;
		this.prix = prix;
	}
	
	public String toString() {
		return "Moteur "+this.type+" "+this.cylindre+" ("+this.prix+Vehicule.prixSigne+")";
	}
	
	public double getPrix() {
		return this.prix;
	}
}
