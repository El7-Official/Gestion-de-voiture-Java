package VehiculeOptions;

import VehiculeMarque.Vehicule;

public class SiegeChauffant implements Option{

	@Override
	public double getPrix() {
		return 562.9;
	}
	
	public String toString() {
		return "Siège chauffant ("+getPrix()+Vehicule.prixSigne+")";
	}
}
