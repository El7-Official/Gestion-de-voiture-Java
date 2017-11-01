import VehiculeMarque.Vehicule;
import java.util.ArrayList;
import java.util.List;

public class Garage {
	List<Vehicule> voitures;
	
	
	public Garage() {
		//Instanciation de la liste Voitures
		voitures = new ArrayList<>();
	}
	
	public String toString() {
		System.out.println("*******************************************\n"+
						   "*   Garage du Voiture d'Ayoub El hassani  *\n"+
						   "*******************************************");
		return getVoiture();
	}
	
	public void addVoiture(Vehicule voit) {
		voitures.add(voit);
	}
	
	private String getVoiture() {
		for(Vehicule voiture : voitures)
			System.out.println(" "+voiture.toString());
		return "";
	}
}
