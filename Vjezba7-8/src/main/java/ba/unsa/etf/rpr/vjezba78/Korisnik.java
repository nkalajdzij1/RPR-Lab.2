package ba.unsa.etf.rpr.vjezba78;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Korisnik {
    private StringProperty ime=new SimpleStringProperty(this, "ime", "");
    private StringProperty prezime= new SimpleStringProperty(this, "prezime", "");
    private StringProperty email= new SimpleStringProperty(this, "email", "");
    private StringProperty usernm= new SimpleStringProperty(this, "usernm", "");
    private StringProperty pass= new SimpleStringProperty(this, "pass", "");

    public Korisnik(StringProperty ime, StringProperty prezime, StringProperty email, StringProperty usernm, StringProperty pass) {
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
        this.usernm = usernm;
        this.pass = pass;
    }

    public String getEmail() {
        return email.get();
    }

    public StringProperty emailProperty() {
        return email;
    }

    public void setEmail(String email) {
        this.email.set(email);
    }

    public String getUsernm() {
        return usernm.get();
    }

    public StringProperty usernmProperty() {
        return usernm;
    }

    public void setUsernm(String usernm) {
        this.usernm.set(usernm);
    }

    public String getPass() {
        return pass.get();
    }

    public StringProperty passProperty() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass.set(pass);
    }

    public void setPrezime(String prezime) {
        this.prezime.set(prezime);
    }

    public String getPrezime() {
        return prezime.get();
    }

    public StringProperty prezimeProperty() {
        return prezime;
    }
    public void setIme(String ime) {
        this.ime.set(ime);
    }

    public String getIme() {
        return ime.get();
    }

    public StringProperty imeProperty() {
        return ime;
    }

    public Korisnik(String ime, String prezime, String email, String usernm, String pass) {
        this.ime.set(ime);
        this.prezime.set(prezime);
        this.email.set(email);
        this.usernm.set(usernm);
        this.pass.set(pass);
    }
}
