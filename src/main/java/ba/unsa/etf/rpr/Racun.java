package ba.unsa.etf.rpr;

public class Racun {
    private Long brojRacuna;
    private Osoba korisnik;
    private Double stanje;
    private Double preko;

    public Racun(Long e, Osoba o){
        this.brojRacuna=e;
        this.korisnik=o;
        this.stanje=0.0;
        this.preko=0.0;
    }
    public boolean provjeriOdobrenjePrekoracenja(Double n){
        if(n-this.preko<1e-10)return false;
        return true;
    }
    public void odobriPrekoracenje(Double n){
        if(this.stanje>2*n){
            this.preko=n;
        }
    }
    public boolean izvrsiUplatu(Double n){
        this.stanje+=n;
        return true;
    }
    public boolean izvrsiIsplatu(Double n){
        if(n<this.stanje){
            this.stanje-=n;
            return true;
        }
        return false;
    }
    public Long brojRacuna(){
        return this.brojRacuna;
    }
    public Osoba korisnikRacuna(){
        return this.korisnik;
    }
    public boolean odobrenjePrekoracenja(){
        if(this.preko>0)return true;
        return false;
    }
    public Double stanjeRacuna(){
        return this.stanje;
    }
}
