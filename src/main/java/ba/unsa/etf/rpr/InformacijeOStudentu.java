package ba.unsa.etf.rpr;
import java.lang.String;

public class InformacijeOStudentu extends LicneInformacije implements mozeSePredstaviti{

    private String godinaStudija;
    private String brojIndexa;



    public String getBrojIndexa() {
        return brojIndexa;
    }

    public String getGodinaStudija() {
        return godinaStudija;
    }



    public void setBrojIndexa(String brojIndexa) {
        this.brojIndexa = brojIndexa;
    }

    public void setGodinaStudija(String godinaStudija) {
        this.godinaStudija = godinaStudija;
    }
    @Override
    public String predstavi(){
        return new String("Ja sam "+ this.getIme()+" "+ this.getPrezime()+" student "+this.godinaStudija+" godine sa brojem indeksa "+this.brojIndexa);
    }

}
