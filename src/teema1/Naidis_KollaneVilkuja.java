package teema1;

import javafx.application.Application;
import javafx.stage.Stage;
import lib.Foor;

public class Naidis_KollaneVilkuja extends Application {

    public void start(Stage primaryStage) throws Exception {
        Foor foor = new Foor();
        int count=0;
        while (count<3) {
            foor.vahetaKollast();
            foor.paus(0.5);
            foor.vahetaKollast();
            foor.paus(0.5);
            count=count+1;
        }
    }

}
