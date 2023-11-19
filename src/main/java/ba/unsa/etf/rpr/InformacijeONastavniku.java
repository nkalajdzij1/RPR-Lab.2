package ba.unsa.etf.rpr;
import java.lang.String;
import java.util.List;

public class InformacijeONastavniku extends LicneInformacije implements mozeSePredstaviti{

    private String titula;
    private List<Ocjena> listaOcjena;

    public void setTitula(String titula) {
        this.titula = titula;
    }


    public List<Ocjena> getListaOcjena(){
        return listaOcjena;
    }
    public void setListaOcjena(List<Ocjena> n){
        this.listaOcjena=n;
    }
    public String getTitula() {
        return titula;
    }
    @Override
    public String predstavi(){
        return new String("Ja sam "+this.titula+" "+this.getIme()+" "+ this.getPrezime()+" profesor/ica ");
    }
}
