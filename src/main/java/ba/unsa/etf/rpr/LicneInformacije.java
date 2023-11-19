package ba.unsa.etf.rpr;
import java.lang.String;

public class LicneInformacije implements mozeSePredstaviti{

    private String ime;
    private String prezime;

    public void setIme(String ime) {
        this.ime = ime;
    }
    public void setPrezime(String prezime){
        this.prezime=prezime;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }
    @Override
    public String predstavi(){
        return new String("Ja sam"+ this.getIme()+" "+ this.getPrezime());
    }

}
