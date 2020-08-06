package application;
import java.awt.Label;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import com.sun.javafx.text.*;
import javafx.animation.PathTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class GardenController extends Main{
	@FXML
	private Button stb ;
	@FXML
	private Button gardenexit ;
	@FXML
	private ImageView sunflower ;
	@FXML
	private ImageView pea ;
	@FXML
	private ImageView zombie ;
	@FXML
	private ImageView lawnmover1 ;
	@FXML
	private ImageView lawnmover2 ;
	@FXML
	private ImageView lawnmover3 ;
	@FXML
	private ImageView lawnmover4 ;
	@FXML
	private ImageView lawnmover5 ;
	@FXML
	private ProgressBar pb ;
	@FXML
	private Button buypeashooter ;
	@FXML 
	private Button buysunflower ;
	@FXML
	private ImageView plant ;
	int buy = 0 ;
	Plant[][] tiles = new Plant[5][9] ;
	@FXML
	private ImageView zombie1;
	@FXML
	private ImageView zombie2;
	@FXML
	private Object sunvalue ;
	@FXML
	private ImageView sun1 ;
	@FXML
	private ImageView sun2 ;
	@FXML
	private ImageView sun3 ;
	class bg_thread implements Runnable{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (int i = 0; i<100 ; i++) {
				pb.setProgress(i/1000.0);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}	
	}	
	public void handleprogress(ActionEvent event) throws InterruptedException {
		Thread th = new Thread(new bg_thread());
		th.start();
		Line l = new Line(0,50,-340,50);
		PathTransition t = new PathTransition() ;
		t.setNode(zombie);
		t.setDuration(Duration.seconds(15));
		t.setPath(l);
		
//		Line pea1 = new Line(0,0,700,0);
//		PathTransition t1 = new PathTransition() ;
//		t1.setNode(pea);
//		t1.setDuration(Duration.seconds(5));
//		t1.setPath(pea1);
//		t1.play();	
		Line l1 = new Line(0,30,-340,30);
		PathTransition t1 = new PathTransition() ;
		t1.setNode(zombie1);
		t1.setDuration(Duration.seconds(25));
		t1.setPath(l1);
		
	
		Line l2 = new Line(0,20,-340,20);
		PathTransition t2 = new PathTransition() ;
		t2.setNode(zombie2);
		t2.setDuration(Duration.seconds(15));
		t2.setPath(l2);
		t.play();int milliseconds = 3000;
		Thread.sleep(milliseconds);
		Line s1 = new Line(230,-15,230,30);
		PathTransition p1 = new PathTransition() ;
		p1.setNode(sun1);
		p1.setDuration(Duration.seconds(15));
		p1.setPath(l2);
		sun1.setOpacity(1);;
		p1.play();
		t1.play();
		Line s2 = new Line(230,-15,230,30);
		PathTransition p2 = new PathTransition() ;
		p2.setNode(sun1);
		p2.setDuration(Duration.seconds(15));
		p2.setPath(s2);
		sun2.setOpacity(1);
		Thread.sleep(milliseconds);
		p2.play();p1.play();
		Line s3 = new Line(230,-15,230,30);
		PathTransition p3 = new PathTransition() ;
		p3.setNode(sun3);
		p3.setDuration(Duration.seconds(15));
		p3.setPath(s3);
		sun3.setOpacity(1);
		p3.play();
		
		//if(zombie.getBoundsInParent().intersects(pea.getBoundsInParent())) {
		//	System.out.println("reached here");
		//}
	}
	public void addsun(MouseEvent e) {
		
	}
	public ImageView handlemovement(String loc, int h, int w, float startX, float startY, float endX, float endY, int dur, Group rt) throws IOException {
        Image i;
        i = new Image(new FileInputStream(loc));
        ImageView iv = new ImageView(i);
        iv.setFitHeight(h);
        iv.setFitWidth(w);
        Line l = new Line(startX,startY, endX, endY);
        PathTransition t = new PathTransition() ;
        t.setNode(iv);
        t.setDuration(Duration.seconds(dur));
        t.setPath(l);
        t.play();
        return iv;
    }
	public void landmover(ActionEvent event) {
		Line l = new Line(0,30,500,30);
		PathTransition t = new PathTransition() ;
		t.setNode(lawnmover3);
		t.setDuration(Duration.seconds(3));
		t.setPath(l);
		t.play();
	}
	public void gobacktomainmenu(ActionEvent event) {
		try {
		    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainMenu.fxml"));
		            Parent root = (Parent) fxmlLoader.load();
		            Stage stage = new Stage();
		            stage.setScene(new Scene(root));  
		            stage.show();
		            Main.stg.close();
		        
		    } catch(Exception e) {
		       e.printStackTrace();
		    }
	}
	public void buypeashooter(ActionEvent event) {
		buy = 1;
	}
	public void buysunflower(ActionEvent event) {
		buy = 2;
	}
	public void buyrock(ActionEvent event) {
		buy = 3;
	}
	public void buymushroom(ActionEvent event) {
		buy = 4;
	}
	public void buybeetroot(ActionEvent event) {
		buy = 5;
	}
	@FXML
	private Button b00,b01,b02,b03,b04,b05,b06,b07,b08 , b10,b11,b12,b13,b14,b15,b16,b17,b18,b20,b21,b22,b23,b24,b25,b26,b27,b28,b30,b31,b32,b33,b34,b35,b36,b37,b38,b40,b41,b42,b43,b44,b45,b46,b47,b48;
	private Stage primaryStage;
	public void plant(ActionEvent event) throws IOException {
		Button b = (Button)event.getSource() ;
		if (b.getGraphic() == null) {
		String s = 	b.getId();
		int x = Integer.parseInt(s.substring(1,2)) ; 
		int y = Integer.parseInt(s.substring(2));
		double xcord = b.getLayoutX() ;
		double ycord = b.getLayoutY() ;
		double width = b.getWidth() ;
		double height = b.getHeight() ;		
		System.out.println(xcord) ;	
		ImageView i = new ImageView() ;	
		System.out.println("here");
		i.setX(xcord); i.setY(ycord);i.setFitWidth(width); i.setFitHeight(height);	
		Image im = null;
		if (buy == 1){		
			im = new Image("file:Images/peashooter.png");
			i.setImage(im);
	        b.setOpacity(1);
			b.setGraphic(i);
			tiles[x][y] = new Peashooter(x,y) ;
			//float 
			//int v = TimeUnit.MILLISECONDS(5000);
			//ImageView dest = handlemovement("file:Image/pea.png",height,width,xcord,ycord,575,ycord,5,) ;
			
		}
        if (buy == 2) {
        	im = new Image("file:Images/sunflower.png");
        	i.setImage(im);
            b.setOpacity(1);
    		b.setGraphic(i);
    		tiles[x][y] = new Sunflower(x,y) ;
        }
        if (buy == 3) {
        	im = new Image("file:Images/rock.png");
        	i.setImage(im);
            b.setOpacity(1);
    		b.setGraphic(i);
    		tiles[x][y] = new Rock(x,y) ;
        }
        if (buy == 4) {
        	im = new Image("file:Images/mushroom.png");
        	i.setImage(im);
            b.setOpacity(1);
    		b.setGraphic(i);
    		tiles[x][y] = new Mushroom(x,y);
        }
        if (buy == 5) {
        	im = new Image("file:Images/chomper.png");
        	i.setImage(im);
            b.setOpacity(1);
    		b.setGraphic(i);
    		tiles[x][y] = new Chomper(x,y);
        }
        b.setPrefHeight(height);b.setPrefWidth(width);b.setLayoutX(xcord); b.setLayoutY(ycord);
         buy = 0 ;
		}
        
	}
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		Main m = new Main();
		this.primaryStage = m.stg;
		Plant[][] gd = new Plant[5][9];
		for (int i = 0 ; i<5 ;i++) {
			Plant[] arr = new Plant[9] ;
			for (int j = 0 ;j <9 ; j++) {
				arr[j] = null ;
			}
			gd[i] = arr ;
		}
		this.tiles = gd ;
		
	}
}
