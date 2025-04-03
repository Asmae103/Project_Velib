package modele;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Carte {
	private ArrayList<Station> liste;

	public Carte() {
		super();
		this.liste = new ArrayList<Station>() ;
	}

	public void addStation(Station station) {
		// TODO Auto-generated method stub
		 this.liste.add(station);
	}
	
	public ObservableList<Station> getStation(){
		  // Remplir l'ObservableList avec les stations de la liste
		ObservableList<Station> values = FXCollections.observableArrayList(liste);
		return values; 
	}
	@Override
	public String toString() {
		String laliste="";
		for(Station s :liste ) { // On parcourt la liste d'objets station
			laliste += s +"\n";	
		}
		return "Carte [liste=" + laliste + "]";
	}
	

	

}
