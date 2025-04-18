package modele;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;


import org.json.JSONArray;
import org.json.JSONObject;

import application.Main;

public class ConnectAPI {
	public static void chargeAPI() {
		/*
		 * try { // /*******CHARGER LE FICHIER
		 ***/
//			//lien API 
//			//String url="https://opendata.paris.fr/api/explore/v2.1/catalog/datasets/velib-disponibilite-en-temps-reel/records?limit=20";
//			//on charge un objet de type URL
//			URL lien = new URI(url).toURL();
//			//on ouvre le contenue de lien , et on le stock en memoire tampon
//			BufferedReader fichier = new BufferedReader(
//					new InputStreamReader(lien.openStream(), Charset.forName("UTF-8")));
//			//ON convertit le fichier en mémoire tampon  au format jsonArray 
//			JSONArray array = new JSONArray(fichier.readLine());
//			
//			/*** Parcours du fichier****/
//			for (Object json : array ) {
//				//on convertit la donnée en cours au format JSONObject
//				JSONObject ligne = (JSONObject) json;
//				//on recupere l'attribut selon son format , ici String 
//				String attribut1 = ligne.getString("attribut1");
//				
//			}
//			
//		}catch (FileNotFoundException err){
//			System.out.println("Erreur : le fichier n'existe pas !\n "+err);
//		}catch(IOException err) {
//			System.out.println("Erreur : !\n "+err);
//		}catch(URISyntaxException e) {
//			// TODO Auto-generated catch block 
//			e.printStackTrace();
//		} */
		
		System.out.println(getFileContent("data.json"));
	}

	public static String getFileContent(String fileName) {
		InputStream inputStream = Main.class.getResourceAsStream(fileName);
		String output = "";

		if (inputStream != null) {
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
			BufferedReader reader = new BufferedReader(inputStreamReader);

			try {
				String line;
				while ((line = reader.readLine()) != null) {
					output += line + "\n";
				}
			} catch (Exception e) {
				System.err.println("Impossible de lire le fichier " + fileName);
			}
		}

		return output;
	}
	/*public static Carte chargeStation(Carte a) {
		
		return a;
	}*/

	/*public Carte chargeStation(Carte a) {
		// TODO Auto-generated method stub
		 // Appel de getFileContent pour récupérer les données JSON sous forme de chaîne
	    String jsonData = getFileContent("data.json");

	    // Vérification si les données sont récupérées correctement
	    if (jsonData.isEmpty()) {
	        System.err.println("Le fichier data.json est vide ou introuvable.");
	        return a; // Retourner l'objet sans modification
	    }

	    System.out.println(jsonData); // Afficher les données pour voir le contenu

		return a;
	}*/
	public Carte chargeStation() {
		 Carte carte = new Carte();
		// TODO Auto-generated method stub
		 // Appel de getFileContent pour récupérer les données JSON sous forme de chaîne
	    String jsonData = getFileContent("data.json");

	    // Vérification si les données sont récupérées correctement
	    if (jsonData.isEmpty()) {
	        System.err.println("Le fichier data.json est vide ou introuvable.");
	        return new Carte(); // Retourner l'objet sans modification
	    }

	  //  System.out.println(jsonData); // Afficher les données pour voir le contenu
        
	  try {
		  //ON CONVERTIT LEchaîne de caractères JSON (jsonData) en un objet JSONArray
		  JSONArray array = new JSONArray(jsonData);
		  for(Object json : array) {
			  JSONObject ligne =(JSONObject) json;
			 
			  // Créer une instance de Station et définir ses propriétés
	            Station station = new Station();
	            station.setNumero(ligne.getString("stationcode"));
	            station.setNom(ligne.getString("name"));
	            station.setCB(ligne.getString("is_renting"));
	            station.setStatutOuvert(ligne.getString("is_installed"));
	            station.setCapacite(ligne.getInt("capacity"));
	            station.setVille(ligne.getString("nom_arrondissement_communes"));
	            station.setVelosDispo(ligne.getInt("numbikesavailable"));
	            station.setAttachesDispo(ligne.getInt("numdocksavailable"));
	            
	            int arrondissement =0;
	            String ville = ligne.getString("nom_arrondissement_communes");
	            if(ville.equalsIgnoreCase("Paris")) {
	            	String codeS = ligne.getString("stationcode");
	            	if( codeS.length()>= 2) {
	            		try {
	            			arrondissement= Integer.parseInt(codeS.substring(0,2));//récupérer les deux premiers chiffres du codeS(sous forme de texte) et à les convertir en entier (int).
	            			if(codeS.length()== 4) {
	            				arrondissement = Integer.parseInt(codeS.substring(0,1));
	            			}
	            		}catch(NumberFormatException e) {
	            			System.out.println("Erreur"+ codeS);
	            		}
	            	}
	            }
	            station.setArrondissement(arrondissement);

                int departement = 0;
                String dep = ligne.getString("code_insee_commune");
                if( dep.length()>= 2) {
                   try {
                	   departement = Integer.parseInt(dep.substring(0,2));
                   }catch(NumberFormatException e) {
	            			System.out.println("Erreur"+ dep);
	            		}
                }
                station.setDepartement(departement);
	            // Ajouter la station à la liste des stations de l'objet Carte
	            
	            int mobilite =0;
	  		  String mob= ligne.getString("stationcode");
	  		  if(mob.length()>= 2) {
                  try {
               	   mobilite = Integer.parseInt(mob.substring(0,2));
                  }catch(NumberFormatException e) {
	            			System.out.println("Erreur"+ mob);
	            		}
               }
               station.setMobile(mobilite);
	            // Ajouter la station à la liste des stations de l'objet Carte
	            carte.addStation(station);  // c est l'instance de la classe Carte
	            
		  }
		  
		  
	  }catch(Exception err) {
		  System.out.println("Erreur "+ err);
	  }
	 
	    
		return  carte;
	}


}