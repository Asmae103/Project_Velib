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
    private Text dep;
    
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

  /*  @FXML
    private ToggleGroup arrondissementGroup;
    */
    @FXML 
    private ToggleGroup choixGroup;
    
    @FXML
    private RadioButton dep93;

    @FXML
    private RadioButton dep92;

    @FXML
    private RadioButton dep95;

    @FXML
    private RadioButton dep94;
    
    @FXML
    private RadioButton mob; 
    
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
        
        choixGroup = new ToggleGroup();
        arr1.setToggleGroup(choixGroup);
        arr2.setToggleGroup(choixGroup);
        arr3.setToggleGroup(choixGroup);
        arr4.setToggleGroup(choixGroup);
        arr5.setToggleGroup(choixGroup);
        arr6.setToggleGroup(choixGroup);
        arr7.setToggleGroup(choixGroup);
        arr8.setToggleGroup(choixGroup);
        arr9.setToggleGroup(choixGroup);
        arr10.setToggleGroup(choixGroup);
        arr11.setToggleGroup(choixGroup);
        arr12.setToggleGroup(choixGroup);
        arr13.setToggleGroup(choixGroup);
        arr14.setToggleGroup(choixGroup);
        arr15.setToggleGroup(choixGroup);
        arr16.setToggleGroup(choixGroup);
        arr17.setToggleGroup(choixGroup);
        arr18.setToggleGroup(choixGroup);
        arr19.setToggleGroup(choixGroup);
        arr20.setToggleGroup(choixGroup);
    
        
        //choix= new ToggleGroup();
        dep92.setToggleGroup(choixGroup);	
        dep93.setToggleGroup(choixGroup);	
        dep94.setToggleGroup(choixGroup);	
        dep95.setToggleGroup(choixGroup);	
        
        mob.setToggleGroup(choixGroup);
     
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
    		dep.setText(String.valueOf(station.getDepartement()));
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
    		dep.setText("");
    	}
    }
    
    
   /* public void setMain(Main main) {
        this.main = main;

        // Add observable list data to the table
        tableView.setItems(main.get());
    }*/


    
    public void SelectArrondissement() {
    	int arrondissementSelectionner = -1;
    	  // Récupère le bouton radio actuellement sélectionné dans le groupe
    	RadioButton selectRadioButton = (RadioButton) choixGroup.getSelectedToggle(); //retourne le bouton sélectionné actuellement
    	
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
        				//arrDeuxchiffre = arrcode.substring(arrcode.length() - 2);
        				arrDeuxchiffre = arrcode.substring(0,2);
        			}else {
        				// Récupère les deux derniers caractères 
        				//arrDeuxchiffre = codeSt.substring(codeSt.length() - 2);
        				arrDeuxchiffre = codeSt.substring(0,2);
        			}
        			if(codeSt.length()==4 ) {
        				arrDeuxchiffre = codeSt.substring(0,1);
        				
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
    
    public void selectDepartement() {
    	int departementSelectionner = 0  ; 
    	
    	RadioButton selectRadioButton = (RadioButton) choixGroup.getSelectedToggle();
    	System.out.println("Selected Toggle: " + choixGroup.getSelectedToggle());
    	if(selectRadioButton != null) {
    		String selectText = selectRadioButton.getText();
    		departementSelectionner = Integer.parseInt(selectText);
    		
    	}
    	
    	if(departementSelectionner != 0) {
    	ObservableList<Station> filtreS = FXCollections.observableArrayList();
    	ObservableList<Station> allStation = c.getStation();
    	System.out.println("Nombre total de stations : " + allStation.size());
    	
    	
    	/*for(Station s : allStation) {
    		int dep = s.getDepartement();
    		String depStr = String.valueOf(dep);
    		int depDeuxchiffre ;
    		
    		if( depStr.length()>= 2) {
                try {
             	   depDeuxchiffre = Integer.parseInt(depStr.substring(0,2));
             	  System.out.println("dep = " + dep + " | depDeuxchiffre = " + depDeuxchiffre + " | attendu = " + departementSelectionner);


          			
	           		   if(dep == departementSelectionner) {
	           			   // Ajout de la station filtrée à la liste
	           			   filtreS.add(s);
	           			System.out.println("Nombre de stations filtrées : " + filtreS.size());
	             	   }
           		   
                }catch(NumberFormatException e) {
	            			System.out.println("Erreur"+ e);
	            		}
             }

    	}*/
    	for (Station s : allStation) {
            int dep = s.getDepartement(); // Récupérer le département sous forme d'entier
            
            // Comparer directement les départements (entiers)
            if (dep == departementSelectionner) {
                filtreS.add(s); // Ajouter la station filtrée à la liste
                System.out.println("Station  " + dep + " | Département attendu: " + departementSelectionner);
            }
        }
    	 tableView.setItems(filtreS);
       
    }
      
    }
    public void selectMobilite() {
    	int Mobilite = 0;
    	RadioButton selectRadioButton = (RadioButton) choixGroup.getSelectedToggle();
    	if(selectRadioButton != null) {
    		String selectText = selectRadioButton.getText();
    	
    	
    	if(selectText.equals("Mobile")) {
    		Mobilite =92;
    		// Création d'une liste vide qui contiendra les stations filtrées
    		ObservableList<Station> filtreS = FXCollections.observableArrayList();
    		ObservableList<Station> allStation = c.getStation();
    		
    		for(Station s : allStation) {
        		//int mob = s.getMobile();
        		String codeSt= s.getNumero();
            	String mobDeuxchiffre ="";
        		if(codeSt.contains("_")) {
    				// Récupère la partie avant le dernier underscore
    				String arrcode = codeSt.substring(0,codeSt.lastIndexOf("_"));
    				
    				// Récupère les deux premiers caractères de cette partie
    				mobDeuxchiffre = arrcode.substring(0,2);
    			}else {
    				  // Récupère les deux premiers caractères 
    				mobDeuxchiffre = codeSt.substring(0,2);
    			}
        		try {
        			int mobcode = Integer.parseInt(mobDeuxchiffre);
            		if( mobcode== Mobilite) {
            			filtreS.add(s);
            		}
        		}catch(NumberFormatException e){
        			System.out.println("erreur "+e );
        		}
        	
        	}
    		 tableView.setItems(filtreS);
    	}
    	
    }
    }
}