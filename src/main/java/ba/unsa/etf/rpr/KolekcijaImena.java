package ba.unsa.etf.rpr;
import java.lang.String;
import java.util.List;
public class KolekcijaImena {
    private List<String> imenaPrezimena;

    public String dajNajduzeIme(){
        String rijec=imenaPrezimena.get(0);
        for(String n: this.imenaPrezimena){
            if(n.length()-1>rijec.length()-1)rijec=n;

        }
        return rijec;
    }

    public void setImenaPrezimena(List<String> imenaPrezimena) {
        this.imenaPrezimena = imenaPrezimena;
    }
}
