package application;

import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
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
    private Text numero ,capacite,nom, arrondissement,ville,statutOuvert,velodisp, attachedisp, cB ;
    
    @FXML
    private TableView<Station> tableView;
    
    @FXML
    private TableColumn<Station, String> Num; 
    
    @FXML
    private TableColumn<Station, String> Nom; 
    
    @FXML 
    private TableColumn<Station, Boolean> CB; 
    
    @FXML 
    private TableColumn<Station, Boolean> Ouvert; 
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
        Num.setCellValueFactory(new PropertyValueFactory<>("numero"));
        Nom.setCellValueFactory(new PropertyValueFactory<>("nom"));
        CB.setCellValueFactory(new PropertyValueFactory<>("cB"));
        Ouvert.setCellValueFactory(new PropertyValueFactory<>("statutOuvert"));
       // tableView.getItems().setAll(c.getStation());
        tableView.setItems(c.getStation()); //pour la liste 
        
    }
   /* public void setMain(Main main) {
        this.main = main;

        // Add observable list data to the table
        tableView.setItems(main.get());
    }*/
}



