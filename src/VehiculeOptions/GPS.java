package VehiculeOptions;

import VehiculeMarque.Vehicule;

public class GPS implements Option{

	@Override
	public double getPrix() {
		return 113.5;
	}
	
	public String toString() {
		return "GPS ("+getPrix()+" "+Vehicule.prixSigne+" )";
	}
	
}
