package teema2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Loo laevade pommitamine, kus on vaid 1x1 laevad ja kasutaja saab arvuti laevasid pommitada 9x9 maatriksil.
 */
public class Kordamine1_laevad_maatriksil {
    static int[][] laud;
    static int lauaLaius=4;
    static int lauaKorgus=4;


    public static void main(String[] args) {
        genereeriLaud();
        laevadeGenereerimine();
        int[] xy=kysiPommitamiseAsukohta();
        kontrolliTabamust(xy);
        //kasOnVeelAllesLaevu();
        //gameover();
    }

    private static void kontrolliTabamust(int[] xy) {
        int x=xy[0];
        int y=xy[1];
        int sihtpinkt = laud[y][x];
        if (sihtpinkt==1){
            System.out.println("pihtas!");
            laud[y][x]=2;
        } else if (sihtpinkt==0){
            System.out.println("m??da");
        }

    }


    private static int[] kysiPommitamiseAsukohta() {
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("?tle veeru number");
            int x=sc.nextInt()-1;
            System.out.println("?tle rea number");
            int y=sc.nextInt()-1;
            int[] xy={x,y};
            return xy;
        } catch (Exception e){
            System.out.println("kirjuta ikka number!");
        }
        return kysiPommitamiseAsukohta();
    }


    private static void laevadeGenereerimine() {
        for (int i = 0; i < lauaKorgus; i++) {
            for (int j = 0; j < lauaLaius; j++) {
                laud[i][j]=(int)(Math.random()*2);
            }
            System.out.println(Arrays.toString(laud[i]));
        }
    }

    private static void genereeriLaud() {
        laud=new int[lauaKorgus][lauaLaius];
    }

}
