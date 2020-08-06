package application;

import javafx.animation.PathTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class BonusController extends Main{

    @FXML
    private Button gardenexit;

    @FXML
    private ImageView lawnmover1;

    @FXML
    private ImageView lawnmover2;

    @FXML
    private ImageView lawnmover3;

    @FXML
    private ImageView lawnmover4;

    @FXML
    private ImageView lawnmover5;

    @FXML
    private Button saveGame;

    @FXML
    private ProgressBar pb;

    @FXML
    private Button stb;

    @FXML
    private Button b00;

    @FXML
    private Button b12;

    @FXML
    private Button b01;

    @FXML
    private Button b02;

    @FXML
    private Button b03;

    @FXML
    private Button b04;

    @FXML
    private Button b05;

    @FXML
    private Button b06;

    @FXML
    private Button b07;

    @FXML
    private Button b08;

    @FXML
    private Button b10;

    @FXML
    private Button b44;

    @FXML
    private Button b13;

    @FXML
    private Button b14;

    @FXML
    private Button b15;

    @FXML
    private Button b16;

    @FXML
    private Button b17;

    @FXML
    private Button b18;

    @FXML
    private Button b11;

    @FXML
    private Button b43;

    @FXML
    private Button b33;

    @FXML
    private Button b23;

    @FXML
    private Button b24;

    @FXML
    private Button b45;

    @FXML
    private Button b35;

    @FXML
    private Button b25;

    @FXML
    private Button b46;

    @FXML
    private Button b36;

    @FXML
    private Button b26;

    @FXML
    private Button b47;

    @FXML
    private Button b37;

    @FXML
    private Button b27;

    @FXML
    private Button b48;

    @FXML
    private Button b38;

    @FXML
    private Button b28;

    @FXML
    private Button b22;

    @FXML
    private Button b21;

    @FXML
    private Button b20;

    @FXML
    private Button b32;

    @FXML
    private Button b31;

    @FXML
    private Button b30;

    @FXML
    private Button b42;

    @FXML
    private Button b41;

    @FXML
    private Button b40;

    @FXML
    private Button b34;

    @FXML
    private ImageView plant;

    @FXML
    private ImageView zombie;

    @FXML
    private ImageView pea;

    @FXML
    private ImageView zombie1;

    @FXML
    private ImageView zombie2;

    int buy = 0 ;
    Plant[][] tiles = new Plant[5][9] ;

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

    @FXML
    void buypeashooter(ActionEvent event) {
        buy  = 1;
    }

    @FXML
    void buysunflower(ActionEvent event) {
        buy = 2;
    }

    @FXML
    void gobacktomainmenu(ActionEvent event) {
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

    @FXML
    void handleprogress(ActionEvent event) throws InterruptedException {
        Line l = new Line(0,50,-340,20);
        PathTransition t = new PathTransition() ;
        t.setNode(zombie);
        t.setDuration(Duration.seconds(10));
        t.setPath(l);
        t.play();

        Line l1 = new Line(0,30,-340,40);
        PathTransition t1 = new PathTransition() ;
        t1.setNode(zombie1);
        t1.setDuration(Duration.seconds(25));
        t1.setPath(l1);
        t1.play();

        Line l2 = new Line(0,10,-340,50);
        PathTransition t2 = new PathTransition() ;
        t2.setNode(zombie2);
        t2.setDuration(Duration.seconds(15));
        t2.setPath(l2);
        t2.play();

        Line pea1 = new Line(0,0,700,0);
        PathTransition p1 = new PathTransition() ;
        p1.setNode(pea);
        p1.setDuration(Duration.seconds(5));
        p1.setPath(pea1);
        p1.play();

        if(zombie.getBoundsInParent().intersects(pea.getBoundsInParent())) {
            System.out.println("reached here");
        }

    }

    @FXML
    void landmover(ActionEvent event) {
        Line l = new Line(0,30,500,30);
        PathTransition t = new PathTransition() ;
        t.setNode(lawnmover3);
        t.setDuration(Duration.seconds(3));
        t.setPath(l);
        t.play();
    }

    @FXML
    void plant(ActionEvent event) {
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

    @FXML
    void saveGame(MouseEvent event) {

    }

}