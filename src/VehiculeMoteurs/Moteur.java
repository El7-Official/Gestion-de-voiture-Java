package VehiculeMoteurs;

public abstract class Moteur {
	private String cylindre;
	private double prix;
	private TypeMoteur type;
	
	public Moteur(String cylindre, double prix) {
		this.cylindre = cylindre;
		this.prix = prix;
	}
	
	public String toString() {
		return "";
	}
	
	public double getPrix() {
		return this.prix;
	}
}
