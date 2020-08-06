package application;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.nio.file.Files;
import java.util.List;
import java.util.ResourceBundle;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.concurrent.Task;
import javafx.event.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration; ;

public class mainController implements Initializable{
	@FXML
	private Stage primaryStage ;
	@FXML
	private Button exit ;
	@FXML
	private Button almanac ;
	@FXML
	private Button instructions ;	
	@FXML
    private Button newUser;

    @FXML
    private Button user;
    @FXML
	private Button quickPlay;
    @FXML
    void findUser(ActionEvent event) throws Exception{
        Parent scene = FXMLLoader.load(getClass().getResource("ExistingUser.fxml"));
       Main.stg.setTitle("Login Page");
        Main.stg.setScene(new Scene(scene, 300, 275));
        Main.stg.show();
    }
    @FXML
	void createNewGame(ActionEvent event) {
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("BonusGarden.fxml"));
			Parent root = (Parent) fxmlLoader.load();
			//Stage stage = new Stage();
			primaryStage.setScene(new Scene(root));
			primaryStage.show();
			//Main.stg.close();


		} catch(Exception e) {
			e.printStackTrace();
		}
	}
    @FXML
    void openNewUser(ActionEvent event) throws Exception{
        Parent scene = FXMLLoader.load(getClass().getResource("AddNewUser.fxml"));
        Main.stg.setTitle("Login Page");
        Main.stg.setScene(new Scene(scene, 300, 275));
        Main.stg.show();
    }

	public void startgame(ActionEvent event) {
		try {
		    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Garden.fxml"));
		            Parent root = (Parent) fxmlLoader.load();
		            //Stage stage = new Stage();
		            primaryStage.setScene(new Scene(root));  
		            primaryStage.show();
		            //Main.stg.close();
	
		            
		    } catch(Exception e) {
		       e.printStackTrace();
		     }
	}
	public void almanac(ActionEvent event) {
		try {
		    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Almanac.fxml"));
		            Parent root = (Parent) fxmlLoader.load();
		            //Stage stage = new Stage();
		            primaryStage.setScene(new Scene(root));  
		            primaryStage.show();
		            //Main.stg.close();
	
		            
		    } catch(Exception e) {
		       e.printStackTrace();
		     }
	}
	public void instructions(ActionEvent event) {
		try {
		    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Instructions.fxml"));
		            Parent root = (Parent) fxmlLoader.load();
		            //Stage stage = new Stage();
		            primaryStage.setScene(new Scene(root));  
		            primaryStage.show();
		            //Main.stg.close();
	
		            
		    } catch(Exception e) {
		       e.printStackTrace();
		     }
	}
	public void exit(ActionEvent event) {
		try {
		            Main.stg.close();
		        
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
