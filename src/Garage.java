import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import VehiculeMarque.Vehicule;

public class Garage {
	FileInputStream fis;
	FileOutputStream fos;
	ObjectInputStream ois;
	ObjectOutputStream oos;
	List<Vehicule> voitures;
	
	public Garage() {
		voitures = new ArrayList<Vehicule>();
	}
	
	public String toString() {
		try {
			fis = new FileInputStream("garage.txt");
			ois = new ObjectInputStream(fis);
			voitures = ((List<Vehicule>)ois.readObject());
			for(Vehicule voit : voitures)
				System.out.println(voit);
		} catch (IOException | ClassNotFoundException e) {
			try {
				throw new Exception("Aucune voiture sauvegardé !");
			} catch (Exception e1) {
				return e1.getMessage();
			}
		}
		return "";
	}
	
	public void addVoiture(Vehicule voit){
		voitures.add(voit); 
		try {
			fos = new FileOutputStream("garage.txt");
			oos = new ObjectOutputStream(fos);	
			oos.writeObject(voitures);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
