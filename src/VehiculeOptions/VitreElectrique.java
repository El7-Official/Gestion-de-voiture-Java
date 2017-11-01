package VehiculeOptions;
import VehiculeMarque.Vehicule;

public class VitreElectrique implements Option{

	@Override
	public double getPrix() {
		return 212.35;
	}
	
	public String toString() {
		return "Vitre electrique ("+getPrix()+Vehicule.prixSigne+")";
	}
}
