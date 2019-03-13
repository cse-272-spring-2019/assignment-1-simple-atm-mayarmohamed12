package atm;
//homescreen
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

public class gui  {
	myatm copy;
	Stage stage;
     double b;
     int index = 0;
     Scene scene;
     Validation tt;
     public gui(Stage stage){
    	 this.stage=stage;
     }
	
	public void preparescene() {
		//
copy = new myatm(1235,0,74);
		//primaryStage.setTitle("ATM");
		//Stage window;
		//window=primaryStage;
	//	Label balance= new Label(" balance");
		Button deposite = new Button("deposite");
		//Stage newWindow =new Stage();
	
		 TextField depositvalueField=new TextField();
		 TextField history=new TextField();
		 history.setText(copy.gethistory(index));
		 TextField balance=new TextField();
		Button withdraw = new Button("withdraw");
		TextField withdrawField=new TextField();
		Button currentbalance = new Button("currentbalance");
		Button pervous = new Button("pervous");
		Button next = new Button("next");
		GridPane grid =new GridPane();
		//GridPane grid1 =new GridPane();
		//TextField value=new TextField("pego");
		
		//VBox Layout= new VBox(10);
		
		//grid.add(usernameLabel, 0, 1);
		grid.add(deposite, 0, 0);
		grid.add(withdraw, 0, 1);
		grid.add(currentbalance,0, 5);
		grid.add(pervous,0, 3);
		grid.add(next,0,4);
	grid.add(depositvalueField,1,0);
	grid.add(withdrawField,1,1);
	grid.add(balance,0,6);
	grid.add(history,1,3);
	
	deposite.setOnAction(new EventHandler<ActionEvent>()  {
		@Override
		public void handle(ActionEvent event){
			// String depositvalueField=depositvalueField .getText();
			String amount = depositvalueField.getText();
			copy.deposit(Double.parseDouble(amount));
//		//	Double value =Double.parseDouble(amount);
//			try{
//				
//				//
//				Double  value =Double.parseDouble(amount);
//				//amount = depositvalueField.getText();
//		// value =Double.parseDouble(amount);
//		 b=copy.deposit(value);
//			}catch(Exception e){
//				JFrame frame= new JFrame();
//			JOptionPane.showMessageDialog(frame,"invalid input");
			//System.out.println(e.getStackTrace());
				//depositvalueField.setText("invaled");
			
			//}
			
		
			//primaryStage.setTitle("ATM");
			
				}
			});
				
				
					
			
		
						
								 
								 
								 
			
	
	
			
		//	b=copy.deposit(value);
	
			//b=copy.deposit(value);
			
		//}
		//});

	withdraw.setOnAction(new EventHandler<ActionEvent>()  {
		@Override
		public void handle(ActionEvent event){
			// String depositvalueField=depositvalueField .getText();
			String amount = withdrawField .getText();
			double value =Double.parseDouble(amount);
			if(value>copy.getcurrentbalance(4)) {
			
				JFrame frame= new JFrame();
			JOptionPane.showMessageDialog(frame,"invalid input");
				return;
			}
			
			
			copy.withdraw(value);
			//////////////////////
			
			
			
			
			
			
			//////////////////////
			
		}
	});
	currentbalance.setOnAction(new EventHandler<ActionEvent>()  {
		@Override
		public void handle(ActionEvent event){
			double k=0;
			k=copy.getcurrentbalance(b);
			//System.out.println(k);
			String z =""+ k;
		balance.setText(z);
		//	balance.setText(k.toString);
			//(new Dice().throwDice()));
			//balance.setText(balance.getText());
			//System.out.println(balance.getText());
			
		}
	});
	pervous.setOnAction(new EventHandler<ActionEvent>()  {
	@Override
	public void handle(ActionEvent event){
		if(index == 4)
			return;
		index++;
		history.setText(copy.gethistory(index));
		
	}
	});
	
	next.setOnAction(new EventHandler<ActionEvent>()  {
		@Override
		public void handle(ActionEvent event){
			if(index == 0)
				return;
	
			index--;
			history.setText(copy.gethistory(index));
			
		}
		});
	scene  =new Scene(grid,400,200);
	}

	public Scene getScene(){
		return this.scene;
	}
	public void setvalidation( Validation tt){
		this.tt=tt;
	}
}
