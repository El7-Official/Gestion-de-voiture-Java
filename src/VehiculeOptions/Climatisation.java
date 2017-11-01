package VehiculeOptions;
import VehiculeMarque.Vehicule;

public class Climatisation implements Option{

	@Override
	public double getPrix() {
		return 347.3;
	}
	
	public String toString() {
		return "Climatisation ("+getPrix()+Vehicule.prixSigne+")";
		
	}

}
