package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.event.*;
import javafx.fxml.FXMLLoader;

public class Main extends Application {
	static Stage stg ;
	@Override
	public void start(Stage primaryStage) {
		try {
			this.stg = primaryStage ;
			//BorderPane root = new BorderPane();
			Parent root = FXMLLoader.load(getClass().getResource("/application/UserMenu.fxml"));
			Scene scene = new Scene(root,500,300);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stg.setScene(scene);
			stg.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void gameBegins(){
		Parent root = null;
		try {
			root = FXMLLoader.load(getClass().getResource("/application/MainMenu.fxml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scene scene = new Scene(root,500,300);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		stg.setScene(scene);
		stg.show();
	}
	//public static void main(String[] args) {
		//launch(Main.class,args);
	//}
}
