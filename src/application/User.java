package application;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import static javafx.application.Application.launch ;
public class User implements Serializable{
	String username;
	Plant[][] tiles = new Plant[5][9] ;
    User sl = null;
    int level = 1;
    Main mainObject ;
    public String getUsername() {
        return username;
    }
    public User(String x){
       username = x ;
       sl = this ;
       mainObject = new Main();
    }
    public void winlevel() {
    	this.level +=1 ;
    }
    public void serialize(User s) throws IOException{
        ObjectOutputStream out;
        this.sl = s;
        String filename = sl.getUsername();
        filename.concat(".txt");
        out = new ObjectOutputStream(new FileOutputStream(filename));
        out.writeObject(sl);
        out.close();
    }
    public User deserialize(String user) throws IOException, ClassNotFoundException{
        ObjectInputStream inp;
        String filename = user;
        filename.concat(".txt");
        inp = new ObjectInputStream(new FileInputStream(filename));
        User s = (User) inp.readObject();
        return s;
    }
    public static void main(String[] args) {
    	launch(Main.class,args);
}
}
