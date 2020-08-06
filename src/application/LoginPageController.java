package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control. Button;

public class LoginPageController extends Main {
    @FXML
    private Button NewUser;

    @FXML
    private Button ExistingUser;

    @FXML
    void findUser(ActionEvent event) throws Exception{
        Parent scene = FXMLLoader.load(getClass().getResource("ExistingUser.fxml"));
       stg.setTitle("Login Page");
        stg.setScene(new Scene(scene, 300, 275));
        stg.show();
    }

    @FXML
    void openNewUser(ActionEvent event) throws Exception{
        Parent scene = FXMLLoader.load(getClass().getResource("AddNewUser.fxml"));
        stg.setTitle("Login Page");
        stg.setScene(new Scene(scene, 300, 275));
        stg.show();
    }
    @FXML
    void exit(ActionEvent e) {
    	stg.close();
    }
}