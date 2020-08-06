package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AlmanacController extends Main implements Initializable {
	@FXML
	private Button algoback ;
	@FXML
	private Button plantgoback ;
	@FXML
	private Button zombiegoback;
	@FXML
	private Button viewplants;
	@FXML
	private Button viewzombies;
	private Stage primaryStage;
	public void gobacktoalmanac(ActionEvent event) {
		try {
		    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Almanac.fxml"));
		            Parent root = (Parent) fxmlLoader.load();
		            //Stage stage = new Stage();
		            primaryStage.setScene(new Scene(root));  
		            primaryStage.show();
		           // Main.stg.close();
		        
		    } catch(Exception e) {
		       e.printStackTrace();
		     }
	}
	public void gobacktomainmenu(ActionEvent event) {
		try {
		    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainMenu.fxml"));
		            Parent root = (Parent) fxmlLoader.load();
		            //Stage stage = new Stage();
		            primaryStage.setScene(new Scene(root));  
		            primaryStage.show();
		            //Main.stg.close();
		        
		    } catch(Exception e) {
		       e.printStackTrace();
		     }
	}
	public void viewplants(ActionEvent event) {
		try {
		    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ViewPlants.fxml"));
		            Parent root = (Parent) fxmlLoader.load();
		          //Stage stage = new Stage();
		            primaryStage.setScene(new Scene(root));  
		            primaryStage.show();
		            //Main.stg.close();
		        
		    } catch(Exception e) {
		       e.printStackTrace();
		     }
	}
	public void viewzombies(ActionEvent event) {
		try {
		    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ViewZombies.fxml"));
		            Parent root = (Parent) fxmlLoader.load();
		          //Stage stage = new Stage();
		            primaryStage.setScene(new Scene(root));  
		            primaryStage.show();
		            //Main.stg.close();
		        
		    } catch(Exception e) {
		       e.printStackTrace();
		     }
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		Main m = new Main();
		this.primaryStage = m.stg;
	}
}
