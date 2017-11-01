package VehiculeMarque;
import java.util.List;
import VehiculeMoteurs.Moteur;
import VehiculeOptions.Option;

public abstract class Vehicule {
	private double prix;
	private String nom;
	private List<Option> options;
	private Marque nomMarque;
	private Moteur motVehicule;
	
	public String toString() {
		return "Juste implémentation";
	}
	
	public void addOption(Option opt) {
		this.options.add(opt);
	}
	
	public Marque getMarque() {
		return this.nomMarque;
	}
	
	public List<Option> getOptions(){
		return this.options;
	}
	
	
	public double getPrix() {
		return this.prix;
	}
	
	public void setMoteur(Moteur motVehicule) {
		this.motVehicule = motVehicule;
	}
}
