package kontrolltoo1;

/**
 * Created by user on 17.11.2015.
 */
public class kontrolltoo1 {
    public static void main(String[] args) {
        //System.out.println(kuupideSumma(2.0,3.0));
        //System.out.println(posPaarisarv(-4));
        System.out.println(valiVahemik(36));
    }

    //Koostage Java-meetod, mis leiab kahe etteantud reaalarvu kuupide summa.
    public static double kuupideSumma(double a, double b){
        double sum=a*a*a+b*b*b;
        return sum;

    }

    //Koostage Java-meetod, mis teeb kindlaks, kas etteantud täisarv n on rangelt positiivne paarisarv.
    public static boolean posPaarisarv(int n){
        if (n% 2==0&&n>0){
           return true;
        } else {
            return false;
        }
    }

    //Koostage Java-meetod, mis leiab etteantud massiivi m negatiivsete elementide summa.

    public static int valiVahemik(int m){
        int result;
        if(m<10){
            result=0;
        } else if(m>=10&&m<35)
        {result=1;
        } else {
            result=2;
        }
        return result;
    }
}
