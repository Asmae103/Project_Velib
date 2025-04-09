package application;

import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.json.JSONArray;
import org.json.JSONObject;

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
    private Text Numero ,capacite,Nom, arrondissement,villeTexte,statutOuvert,velodisp, attachesDispo, cB;
    
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
    
    @FXML
    private RadioButton arr1;

    @FXML
    private RadioButton arr7;

    @FXML
    private RadioButton arr2;

    @FXML
    private RadioButton arr6;

    @FXML
    private RadioButton arr8;

    @FXML
    private RadioButton arr3;

    @FXML
    private RadioButton arr9;

    @FXML
    private RadioButton arr5;

    @FXML
    private RadioButton arr4;

    @FXML
    private RadioButton arr12;

    @FXML
    private RadioButton arr11;

    @FXML
    private RadioButton arr13;

    @FXML
    private RadioButton arr10;

    @FXML
    private RadioButton arr19;

    @FXML
    private RadioButton arr18;

    @FXML
    private RadioButton arr17;

    @FXML
    private RadioButton arr16;

    @FXML
    private RadioButton arr15;

    @FXML
    private RadioButton arr14;

    @FXML
    private RadioButton arr20;

    @FXML
    private ToggleGroup arrondissementGroup;
   /* 
    public void chargerStations() {
        ObservableList<Station> stationsList = Carte.getStation();  // Appeler la méthode getStations pour obtenir la liste
        tableView.setItems(stationsList);  // Lier la liste des stations au TableView
    }*/
   // private Carte c = new Carte();
    private Carte c;//= con.chargeStation();
    
  
    @FXML
    public void initialize() {
       c= con.chargeStation();
    	c.toString();
        // Lier les colonnes aux attributs de Station
        numero.setCellValueFactory(new PropertyValueFactory<>("numero"));
        nom.setCellValueFactory(new PropertyValueFactory<>("nom"));
        cb.setCellValueFactory(new PropertyValueFactory<>("cb"));
        ouvert.setCellValueFactory(new PropertyValueFactory<>("statutOuvert"));
       // tableView.getItems().setAll(c.getStation());
        tableView.setItems(c.getStation()); //pour la liste 
        
        arrondissementGroup = new ToggleGroup();
        arr1.setToggleGroup(arrondissementGroup);
        arr2.setToggleGroup(arrondissementGroup);
        arr3.setToggleGroup(arrondissementGroup);
        arr4.setToggleGroup(arrondissementGroup);
        arr5.setToggleGroup(arrondissementGroup);
        arr6.setToggleGroup(arrondissementGroup);
        arr7.setToggleGroup(arrondissementGroup);
        arr8.setToggleGroup(arrondissementGroup);
        arr9.setToggleGroup(arrondissementGroup);
        arr10.setToggleGroup(arrondissementGroup);
        arr11.setToggleGroup(arrondissementGroup);
        arr12.setToggleGroup(arrondissementGroup);
        arr13.setToggleGroup(arrondissementGroup);
        arr14.setToggleGroup(arrondissementGroup);
        arr15.setToggleGroup(arrondissementGroup);
        arr16.setToggleGroup(arrondissementGroup);
        arr17.setToggleGroup(arrondissementGroup);
        arr18.setToggleGroup(arrondissementGroup);
        arr19.setToggleGroup(arrondissementGroup);
        arr20.setToggleGroup(arrondissementGroup);
    

    }
    /**
    @param Station 
    */
    public void selectStation(MouseEvent event) {
    	Station station = tableView.getSelectionModel().getSelectedItem();
    	System.out.println("test");
    	System.out.println("Arr: " + station.getArrondissement());
    	if(station != null) {
    		codeS.setText(station.getNumero());
    		firstName.setText(station.getNom());
    		arrondissement.setText(String.valueOf(station.getArrondissement()));
    		villeTexte.setText(station.getVille());
    		statutOuv.setText(station.getStatutOuvert());
    		capacite.setText(String.valueOf(station.getCapacite()));
    		velodisp.setText(String.valueOf(station.getVelosDispo()));
    		attachesDispo.setText(String.valueOf(station.getAttachesDispo()));
    		cB.setText(station.getCb());
    		
    	}
    	else {
    		codeS.setText("");
    		firstName.setText("");
    		arrondissement.setText("");
    		villeTexte.setText("");
    		statutOuv.setText("");
    		capacite.setText("");
    		velodisp.setText("");
    		attachesDispo.setText("");
    		cB.setText("");
    		
    	}
    }
    
    
   /* public void setMain(Main main) {
        this.main = main;

        // Add observable list data to the table
        tableView.setItems(main.get());
    }*/

 /*
    public void SelectArrondissement() {
    	int arrondissementSelectionner = -1;
    	if(arr1.isSelected() ){//isSelected()	Retourne true si le RadioButton est sélectionné, sinon false.
    		arrondissementSelectionner = 1;
    	}else if(arr2.isSelected() ){
    		arrondissementSelectionner = 2;
    	}else if(arr3.isSelected() ){
    		arrondissementSelectionner = 3;
    	}else if(arr4.isSelected() ){
    		arrondissementSelectionner = 4;
    	}else if(arr5.isSelected() ){
    		arrondissementSelectionner = 5;
    	}else if(arr6.isSelected() ){
    		arrondissementSelectionner = 6;
    	}else if(arr7.isSelected() ){
    		arrondissementSelectionner = 7;
    	}else if(arr8.isSelected() ){
    		arrondissementSelectionner = 8;
    	}else if(arr9.isSelected() ){
    		arrondissementSelectionner = 9;
    	}else if(arr10.isSelected() ){
    		arrondissementSelectionner = 10;
    	}else if(arr11.isSelected() ){
    		arrondissementSelectionner = 11;
    	}else if(arr12.isSelected() ){
    		arrondissementSelectionner = 12;
    	}else if(arr13.isSelected() ){
    		arrondissementSelectionner = 13;
    	}else if(arr14.isSelected() ){
    		arrondissementSelectionner = 14;
    	}else if(arr15.isSelected() ){
    		arrondissementSelectionner = 15;
    	}else if(arr16.isSelected() ){
    		arrondissementSelectionner = 16;
    	}else if(arr17.isSelected() ){
    		arrondissementSelectionner = 17;
    	}else if(arr18.isSelected() ){
    		arrondissementSelectionner = 18;
    	}else if(arr19.isSelected() ){
    		arrondissementSelectionner = 19;
    	}else if(arr20.isSelected() ){
    		arrondissementSelectionner = 20;
    	}
    	if(arrondissementSelectionner != -1) {
    		ObservableList<Station> filtreS = FXCollections.observableArrayList();
    		ObservableList<Station> allStation = c.getStation();

            for(Station s : allStation) {
            	String ville = s.getVille();
            	String codeSt= s.getNumero();
            	
            	if(ville.equalsIgnoreCase("Paris")) {
            		// Extraire uniquement la partie numérique du code postal avant "_"
        			if(codeSt.contains("_")) {
        				String arrchiffre = codeSt.split("_")[0];
        				if(arrchiffre.length() >=2 ) {
                   		 /*  String arrDechiffre = codeS.substring(3,5);//Integer.parseInt(codeS.substring(3,2));
                   		   int arrcode = Integer.parseInt(arrDechiffre);
                   		   */
                   			
                   		/*	String arrDeuxchiffre = codeSt.substring(codeSt.length() - 2);
                   			int arrcode = Integer.parseInt(arrDeuxchiffre);
                   		   if(arrcode == arrondissementSelectionner) {
                   			   // Ajout de la station filtrée à la liste
                   			   filtreS.add(s);
                   		   }
        			}
            		 
            		
            			
            		}
            	}
            	
            }
            tableView.setItems(filtreS);
    	}
    }*/
    
    public void SelectArrondissement() {
    	int arrondissementSelectionner = -1;
    	  // Récupère le bouton radio actuellement sélectionné dans le groupe
    	RadioButton selectRadioButton = (RadioButton) arrondissementGroup.getSelectedToggle(); //retourne le bouton sélectionné actuellement
    	
    	if (selectRadioButton != null) {
            // Récupère le texte du bouton (normalement le numéro de l'arrondissement)
            String selectedText = selectRadioButton.getText();

            // Convertit ce texte en entier (ex: "5" devient 5)
             arrondissementSelectionner = Integer.parseInt(selectedText);
            }
    	if(arrondissementSelectionner != -1) {
    		// Création d'une liste vide qui contiendra les stations filtrées
    		ObservableList<Station> filtreS = FXCollections.observableArrayList();
    		// Récupère toutes les stations
    		
    		ObservableList<Station> allStation = c.getStation();
    		

            for(Station s : allStation) {
            	String ville = s.getVille();
            	String codeSt= s.getNumero();
            	String arrDeuxchiffre ="";
            	if(ville.equalsIgnoreCase("Paris")) {
            		// Extraire uniquement la partie numérique du code postal avant "_"
        			if(codeSt.contains("_")) {
        				// Récupère la partie avant le dernier underscore
        				String arrcode = codeSt.substring(0,codeSt.lastIndexOf("_"));
        				// Récupère les deux derniers caractères de cette partie
        				arrDeuxchiffre = arrcode.substring(arrcode.length() - 2);
        			}else {
        				arrDeuxchiffre = codeSt.substring(codeSt.length() - 2);
        			}
        			try {
        				int arrcode = Integer.parseInt(arrDeuxchiffre);
            			
            			
                		   if(arrcode == arrondissementSelectionner) {
                			   // Ajout de la station filtrée à la liste
                			   filtreS.add(s);
                		   }
        			}catch(NumberFormatException e) {
        				System.out.println("erreur "+e );
        			}
                   			
        			
            		 
            		
            			
            		}
            	}
            	
            
            tableView.setItems(filtreS);
    	}
    }
}