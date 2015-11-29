package teema2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * 1. Joonista eesti lipp kasutades kolme Rectangle
 * 2. Joonista Jaapani lipp kasutades Rectangle ja Circle
 */
public class Harjutus1_lipud extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        eestiLipp();
        jaapaniLipp();
    }

    private void jaapaniLipp() {
        Stage lava=new Stage();
        Pane pane=new Pane();
        Scene stseen = new Scene(pane,500,300);
        lava.setScene(stseen);

        Rectangle kast=new Rectangle(0,0,500,300);
        kast.setFill(Color.WHITE);
        pane.getChildren().add(kast);

        Circle kast1=new Circle(250,150,100);
        kast1.setFill(Color.RED);
        pane.getChildren().add(kast1);

        lava.show();
    }

    private void eestiLipp() {
        Stage lava=new Stage();
        Pane pane=new Pane();
        Scene stseen = new Scene(pane,500,300);
        lava.setScene(stseen);

        Rectangle kast=new Rectangle(0,0,500,100);
        kast.setFill(Color.BLUE);
        pane.getChildren().add(kast);

        Rectangle kast1=new Rectangle(0,100,500,100);
        kast1.setFill(Color.BLACK);
        pane.getChildren().add(kast1);

        Rectangle kast2=new Rectangle(0,200,500,100);
        kast2.setFill(Color.WHITESMOKE);
        pane.getChildren().add(kast2);

        lava.show();
    }
}

