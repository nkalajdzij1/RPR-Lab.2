package ba.unsa.etf.rpr;
import java.lang.String;
import java.util.List;

public class KolekcijaImenaIPrezimena {
    private List<String> imena;
    private List<String> prezimena;

    public void setImena(List<String> imena) {
        this.imena = imena;
    }

    public void setPrezimena(List<String> prezimena) {
        this.prezimena = prezimena;
    }
    public int getIndexNajduzegPara(){
        int indeks=0;
        int duzina=0;
        for(int i=0; i<imena.size()&&i<prezimena.size(); i++){
            if(imena.get(i).length()+prezimena.get(i).length()>=duzina)indeks=i;
        }
        return indeks;
    }
    public String getImeiPrezime(int i){
        return imena.get(i)+" "+prezimena.get(i);
    }
}
