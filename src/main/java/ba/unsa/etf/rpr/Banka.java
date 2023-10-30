package ba.unsa.etf.rpr;

public class Banka {
    private Long brojRacuna;
    public
    Banka(){
        this.brojRacuna= 0L;
    }
    Korisnik kreirajNovogKorisnika(String i, String p){
        Korisnik s=new Korisnik(i,p);
        return s;
    }
    Uposlenik kreirajNovogUposlenika(String i, String p){
        Uposlenik s=new Uposlenik(i,p);
        return s;
    }
    Racun kreirajRacunZaKorisnika(Korisnik k){
        return new Racun(this.brojRacuna,(Osoba)k);
    }


}
