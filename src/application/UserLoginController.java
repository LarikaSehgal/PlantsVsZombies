package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class UserLoginController extends Main{
    @FXML
    private TextField userInput;
   
    @FXML
    void findUser(ActionEvent event) throws IOException {
        String username = userInput.getText();

        while(username==null){
            Stage notification = new Stage();
            Text text = new Text();
            text.setText("Invalid User Input. Add Name");
            Group root = new Group(text);
            notification.setTitle("Invalid Input");
            notification.setScene(new Scene(root, 300, 275));
            notification.show();
            notification.close();

            username = userInput.getText();
        }
        System.out.println("reached here");
        Boolean b = true;
        User user=null;
        try {
            user = new User(username).deserialize(username);
            b = false;
            
        } catch (IOException e) {
            //e.printStackTrace();
        	
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
        	if(b == true) {
        		Parent scene = FXMLLoader.load(getClass().getResource("UserMenu.fxml"));
        	       stg.setTitle("Login Page");
        	        stg.setScene(new Scene(scene, 300, 275));
        	        stg.show();
        	}
        	//}
        }
        
    }
    @FXML
    private TextField newUsername ;
    @FXML
    private TextField newUserAge ;

    @FXML
    void createUser(ActionEvent event) {
    	System.out.println(newUsername.getText());
    	System.out.println(newUserAge.getText());
        String username = newUsername.getText();
        int age = Integer.parseInt(newUserAge.getText());

        while(username==null){
            Stage notification = new Stage();
            Text text = new Text();
            text.setText("Invalid User Input. Add Name");
            Group root = new Group(text);
            notification.setTitle("Invalid Input");
            notification.setScene(new Scene(root, 300, 275));
            notification.show();
            notification.close();

            username = userInput.getText();
        }
        User user = new User(username);
        user.mainObject.gameBegins();
    }
    @FXML
    void exit(ActionEvent e) {
    	System.exit(0);
    }
}
