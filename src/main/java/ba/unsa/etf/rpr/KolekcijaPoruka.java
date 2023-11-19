package ba.unsa.etf.rpr;
import  java.lang.String;
import java.util.List;

public class KolekcijaPoruka {
    private List<String> poruke;

    public List<String> getPoruke() {
        return poruke;
    }
    public KolekcijaPoruka(List<mozeSePredstaviti> n){
        for(mozeSePredstaviti s: n){
            this.poruke.add(s.predstavi());
        }
    }
}

