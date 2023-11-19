package ba.unsa.etf.rpr;
import java.lang.String;
import java.util.List;

public class Predmet implements mozeSePredstaviti {
    private String naziv;
    private String opis;
    private List<Ocjena> listaOcjena;

    public String getNaziv() {
        return naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
    @Override
    public String predstavi(){
        return new String("Ovaj predmet se zove "+this.naziv+" a, opis i cilj predmeta je kako slijedi: "+this.opis);
    }
    public List<Ocjena> getListaOcjena(){
        return listaOcjena;
    }
    public void setListaOcjena(List<Ocjena> n){
        this.listaOcjena=n;
    }
}
