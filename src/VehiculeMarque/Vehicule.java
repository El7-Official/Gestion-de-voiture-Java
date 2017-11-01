package VehiculeMarque;

import java.util.ArrayList;
import java.util.List;
import VehiculeMoteurs.Moteur;
import VehiculeOptions.Option;

public abstract class Vehicule{
	public static char prixSigne = '€';
	private double prix;
	private String nom;
	private List<Option> options;
	protected Marque nomMarque;
	private Moteur motVehicule;
	
	public Vehicule() {
		//Instanciation de la liste des options
		this.options = new ArrayList<>();
		//Instanciation du variable nom qui prend le nom de la classe associé à l'instance d'objet
		this.nom = this.getClass().getSimpleName();
	}
	
	public String toString() {
		return "+ Voiture "+this.nomMarque+" : "+
				this.nom+" "+this.motVehicule.toString()+" "+
				this.options.toString()+" d'une valeur totale de "+getPrix()+" "+prixSigne;
	}
	
	//Spécifier les options à ajouter à une liste d'options du voitures
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
		if(this.options.isEmpty()) 
			return this.prix;
		else{
			for(int i = 0; i < this.options.size(); i++) {
				this.prix += options.get(i).getPrix();
			}
			return this.prix;
		}			
	}
	
	public void setMoteur(Moteur motVehicule) {
		this.motVehicule = motVehicule;
		this.prix = this.motVehicule.getPrix();
	}				

}
