package VehiculeOptions;

import VehiculeMarque.Vehicule;

public class BarreDeToit implements Option{
	
	@Override
	public double getPrix() {
		return 29.9;
	}
	
	public String toString() {
		return "Barre de toit ("+getPrix()+Vehicule.prixSigne+")";
		
	}

}
