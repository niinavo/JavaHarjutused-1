package teema1;

import javafx.application.Application;
import javafx.stage.Stage;
import lib.Foor;

/**
 * Kasuta objekti Foor, et teha valgusfoori tsükkel 5 korda.
 * Foori kasutusjuhend: https://github.com/KristerV/javaHarjutused
 *
 * Abiks on "Naidis_KollaneVilkuja" klass, kus on juba kollane tuli vilkuma pandud.
 * Lisaks tuleb teada, et Foor on JavaFX programm. Tavalise programmiga
 * on kaks erinevust: klass peab laiendama (extends) teist klassi nimega
 * Application ja programm mitte ei alga main() meetodi seest, vaid
 * hoopis start() meetodi seest. Vaata Naidis_KollaneVilkuja näidet. Muide,
 * kui "extends Application" õigesse kohta ära kirjutad siis Intellij
 * pakub sulle, et kirjutab ise start() meetodi õigesti ära - proovi järgi.
 *
 * NB! Kui kirjutad new Foor(); siis IDE pakub sulle Foori importimise võimalust.
 * Kliki punase teksti peale ja vajuta alt+enter.
 */
public class Peamurdja1_foor extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Foor foor = new Foor();
        int count=0;
        while (count<1){
            foor.vahetaPunast();
            foor.paus(2);
            foor.vahetaKollast();
            foor.paus(1);
            foor.kustutaKollane();
            foor.kustutaPunane();
            int count2=0;
            while (count2<6) {
                foor.vahetaRohelist();
                foor.paus(0.5);
                count2=count2+1;
            }
            foor.vahetaKollast();
            foor.paus(1.5);
            foor.vahetaKollast();
            foor.vahetaPunast();
            count=count+1;
        }


    }
}
