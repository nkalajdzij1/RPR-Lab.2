package ba.unsa.etf.rpr.vjezba78;

import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class KorisniciModel {
    private ObservableList<Korisnik> kolekcija;
    private SimpleObjectProperty<Korisnik> trenutni;

    public KorisniciModel() {

        this.kolekcija = FXCollections.observableArrayList();
        this.trenutni = new SimpleObjectProperty<>();
    }

    // Getter for the ObservableList
    public ObservableList<Korisnik> getKolekcija() {
        return kolekcija;
    }


    public Korisnik getTrenutni() {
        return trenutni.get();
    }

    public SimpleObjectProperty<Korisnik> trenutniProperty() {
        return trenutni;
    }

    public void setTrenutni(Korisnik trenutni) {
        this.trenutni.set(trenutni);
    }
    public void napuni(Korisnik korisnik) {
        kolekcija.add(korisnik);
    }
}
