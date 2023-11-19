package ba.unsa.etf.rpr;
import java.lang.String;
import java.util.List;

public class Pobjednik {
    private String ime;
    private String prezime;
    private int brojZnakova;
    private KolekcijaImena kolekcija;

    public Pobjednik(KolekcijaImena n){
        String k=n.dajNajduzeIme();
        String[] niz= new String[2];
        niz=k.split(" ");
        this.brojZnakova=niz[0].length();
        this.ime=niz[0];
        this.prezime=niz[1];
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getBrojZnakova() {
        return brojZnakova;
    }
}
