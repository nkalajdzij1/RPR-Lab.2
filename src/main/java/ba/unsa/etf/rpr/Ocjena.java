package ba.unsa.etf.rpr;

public class Ocjena {
    private int ocjena;
    private LicneInformacije osoba;

    public void setOcjena(int n) {
        if(n>0&&n<=10)this.ocjena=n;
    }
    public Ocjena(LicneInformacije person, int auswertung){
        this.ocjena=auswertung;
        this.osoba=person;
    }
    public void Ispisi(){
        System.out.println("Student "+ this.osoba.getIme()+" "+this.osoba.getPrezime()+" dao je ocjenu "+this.ocjena);
    }
}
