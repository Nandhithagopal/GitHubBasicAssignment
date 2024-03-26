module Mp3Player {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.media;
	requires javafx.base;
	requires javafx.graphics;
	requires java.desktop;
	
	opens application to javafx.graphics, javafx.fxml;
}
