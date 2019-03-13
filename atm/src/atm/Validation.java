package atm;

import javafx.scene.control.TextField;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

//v=loginform y3ni de eli hatzhar el awal 
public class Validation  {
	Scene scene;
	Stage stage;
	gui vv;
	public Validation(Stage stage){
		this.stage=stage;
	}
	public void draw(){
//Scene scene;
//GridPane window =new GridPane();
Button accno =new Button("accnumber");
TextField numberfield=new TextField();
Label hello =new Label();
GridPane xy =new GridPane();
myatm account= new myatm(1235,0,74);
xy.add(accno,0,1);
xy.add(numberfield,1, 0);
xy.add(hello, 1,1);

accno.setOnAction(new EventHandler<ActionEvent>(){
	@Override
	public void handle(ActionEvent event){
		String amount =  numberfield.getText();
		double value =Double.parseDouble(amount);
	 double b=account.validation();
	// Label hello =new Label();
	if(b==value){
	hello.setText("welcome");	
	stage.setScene(vv.getScene());
	}else{
		hello.setText("invalid");
	}
	
	}
});
scene  =new Scene(xy,400,200);
	}


public Scene getScene(){
	return this.scene;
}
public void setgui(gui vv){
     this. vv=vv;
}
}
