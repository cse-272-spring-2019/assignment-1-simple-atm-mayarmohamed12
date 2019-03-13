package atm;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
//shopping
public class Maingui extends Application {
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("ATM");
		Validation va=new Validation(primaryStage);
		gui ve=new gui(primaryStage);
		va.draw();
		ve.preparescene();
		va.setgui(ve);
		
		primaryStage.setScene(va.getScene());
		primaryStage.show();
	
	
	}
	public static void main(String[] args) {
		launch(args);
	}
	
	
}
