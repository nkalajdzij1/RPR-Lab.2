package ba.etf.unsa.rpr;
import java.util.Scanner;
import java.lang.Math;
import java.lang.Integer;
public class Main {
    public static void main(String[] args) {

        int n;
        //System.out.println("Unesite n: ");
        n=Integer.parseInt(args[0]);
        double b= Math.toRadians(n);
        System.out.println(Math.sin(b));
        int c=1;
        for(int i=1; i<=n; i++){
            c*=i;
        }
        System.out.println(c);

    }
}