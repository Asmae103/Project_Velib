module Project {
	requires javafx.controls;
	requires javafx.fxml;
	requires org.json;
	requires javafx.base;
	requires javafx.graphics;
	
	opens application to javafx.graphics, javafx.fxml;
	opens modele to javafx.base;
}
