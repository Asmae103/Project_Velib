module Project {
	requires javafx.controls;
	requires javafx.fxml;
	requires org.json;
	requires javafx.base;
	
	opens application to javafx.graphics, javafx.fxml;
	opens modele to javafx.base;
}
