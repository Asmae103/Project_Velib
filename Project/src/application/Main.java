package application;
	
import javafx.application.Application;

import javafx.stage.Stage;
import modele.ConnectAPI;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;

/*public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}  
	<AnchorPane prefHeight="555.0" prefWidth="838.0" BorderPane.alignment="CENTER">*/

	public class Main extends Application {
		@Override
		public void start(Stage primaryStage) {
			try {
				AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
				Scene scene = new Scene(root);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.show();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	
	public static void main(String[] args) {
		launch(args);
		ConnectAPI con = new ConnectAPI();
		con.chargeAPI();
		
	}
}
