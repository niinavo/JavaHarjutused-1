package teema1;

import java.util.Scanner;

/**
 * Juhuslikkus
 *
 * 1. Kirjutada mäng kull ja kiri.
 *    Programm küsib kasutajalt: kas kull või kiri? "Viskab" mündi ja
 *    teatab, kas kasutaja arvas õigesti või mitte.
 *    Vihje: ära hakka jändama Stringidega, küsi kasutajalt number.
 *
 * 2. Kirjutada liisu tõmbamise programm.
 *    Küsida kasutajalt inimeste arv. Väljastada juhuslik number vahemikus 1
 *    kuni arv (kaasaarvatud).
 *    NB! Kontrollida, et töötab õigesti: st. öeldes mitu korda järjest
 *    arvuks 3, peab võimalike vastuste hulgas olema nii ühtesid, kahtesid kui kolmi.
 *
 * 3. Kirjutada täringumäng:
 *    Programm viskab kaks täringut mängijale ja kaks täringut endale
 *    (arvutile), arvutab mõlema mängija silmade summad ja teatab,
 *    kellel oli rohkem.
 */
public class Harjutus3_Juhuslikkus {
    public static void main(String[] args) {
        kullKiri();
    }

    public static void kullKiri(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Kas 1 (kull) või 0 (kiri)");
        int sisestus = sc.nextInt();
        int viseTulemus= (int) (Math.random()*2);
        if (sisestus==viseTulemus){
            System.out.println("Sa arvasid õigesti");
        } else {
            System.out.println("Sa arvasid valesti");
        }
        System.out.println("sisestus: "+sisestus);
        System.out.println("vise tulemus: "+viseTulemus);
    }
}
