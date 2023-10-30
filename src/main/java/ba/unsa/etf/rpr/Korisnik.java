package ba.unsa.etf.rpr;

public class Korisnik extends Osoba {
    private Racun r;

    public Korisnik(String i, String p) {
        super(i, p);
    }

public Racun racun(){
    return this.r;
}
public void dodajRacun(Racun ra){
        this.r=ra;
}
}
