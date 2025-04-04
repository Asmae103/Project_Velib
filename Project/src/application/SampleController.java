package application;

import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import modele.Carte;
import modele.ConnectAPI;
import modele.Station;

public class SampleController {
	
   
    private ConnectAPI con = new ConnectAPI();
    private Main main;
    
    @FXML
    private Label numS;

    @FXML
    private Text Numero ,capacite,Nom, arrondissement,ville,statutOuvert,velodisp, attachedisp, cB;
    
    @FXML
    private TableView<Station> tableView;
    
    @FXML
    private TableColumn<Station, String> numero; 
    
    @FXML
    private TableColumn<Station, String> nom; 
    
    @FXML 
    private TableColumn<Station, String> cb; 
    
    @FXML 
    private TableColumn<Station, String> ouvert; 
    
    @FXML
    private Text codeS;

    @FXML
    private Text firstName;

    @FXML
    private Text statutOuv;

   /* 
    public void chargerStations() {
        ObservableList<Station> stationsList = Carte.getStation();  // Appeler la méthode getStations pour obtenir la liste
        tableView.setItems(stationsList);  // Lier la liste des stations au TableView
    }*/
   // private Carte c = new Carte();
    private Carte c= con.chargeStation();
    
  
    @FXML
    public void initialize() {
    //    c= con.chargeStation();
    	c.toString();
        // Lier les colonnes aux attributs de Station
        numero.setCellValueFactory(new PropertyValueFactory<>("numero"));
        nom.setCellValueFactory(new PropertyValueFactory<>("nom"));
        cb.setCellValueFactory(new PropertyValueFactory<>("cb"));
        ouvert.setCellValueFactory(new PropertyValueFactory<>("statutOuvert"));
       // tableView.getItems().setAll(c.getStation());
        tableView.setItems(c.getStation()); //pour la liste 
    }
    
    @FXML
    public void selectStation(MouseEvent event) {
    	Station station = tableView.getSelectionModel().getSelectedItem();
    	System.out.println("test");
    	if(station != null) {
    		codeS.setText(station.getNumero());
    		firstName.setText(station.getNom());
    		arrondissement.setText(station.getArrondissement());
    		ville.setText(station.getVille());
    		statutOuv.setText(station.getStatutOuvert());
    		capacite.setText(String.valueOf(station.getCapacite()));
    		velodisp.setText(String.valueOf(station.getVelosDispo()));
    		cB.setText(station.getCb());
    		
    	}
    	else {
    		codeS.setText("");
    		firstName.setText("");
    		arrondissement.setText("");
    		ville.setText("");
    		statutOuv.setText("");
    		capacite.setText("");
    		velodisp.setText("");
    		cB.setText("");
    		
    	}
    }
    
   /* public void setMain(Main main) {
        this.main = main;

        // Add observable list data to the table
        tableView.setItems(main.get());
    }*/

   /* public void showStationDetails(Station station) {
    	System.out.println("CLIK OK");
    	if(station != null) {
    		codeS.setText(station.getNumero());
    		firstName.setText(station.getNom());
    		arrondissement.setText(station.getArrondissement());
    		ville.setText(station.getVille());
    		statutOuv.setText(station.getStatutOuvert());
    		capacite.setText(String.valueOf(station.getCapacite()));
    		velodisp.setText(String.valueOf(station.getVelosDispo()));
    		cB.setText(station.getCb());
    		
    	}else {
    	
    		codeS.setText("");
    		firstName.setText("");
    		arrondissement.setText("");
    		ville.setText("");
    		statutOuv.setText("");
    		capacite.setText("");
    		velodisp.setText("");
    		cB.setText("");
    		
    	}
    }*/
}



