package ba.unsa.etf.rpr;
import java.util.Scanner;

public class Osoba {
    private String ime;
    private String prezime;

    public Osoba(String a,String b){
        this.ime=a;
        this.prezime=b;
    }
@Override
    public String toString(){
       return this.ime+this.prezime;

}


}
