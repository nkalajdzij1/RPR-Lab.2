package ba.unsa.etf.rpr.vjezba78;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HelloController {

    private Stage stage;  // Reference to the stage

    public void setStage(Stage stage) {
        this.stage = stage;
    }
    @FXML
    private ListView lista;
    @FXML
    private Label ime;
    @FXML
    private Label prezime;
    @FXML
    private Label email;
    @FXML
    private Label username;
    @FXML
    private Label pass;
    @FXML
    private TextField tfIme;
    @FXML
    private TextField tfPrezime;
    @FXML
    private TextField tfEmail;
    @FXML
    private TextField tfUsername;
    @FXML
    private PasswordField pfLozinka;
    @FXML
    private Button buttKraj;
    @FXML
    private Button buttDodaj;

    KorisniciModel model=new KorisniciModel();

    @FXML
    public void initialize() {
        if (model.getTrenutni() != null) {
            tfIme.textProperty().bindBidirectional(model.getTrenutni().imeProperty());
            lista.setItems(model.getKolekcija());
            lista.getSelectionModel().selectedItemProperty().addListener((obs, oldKorisnik, newKorisnik) -> {
                model.setTrenutni((Korisnik) newKorisnik);
                lista.refresh();
            });
        }
    }

    @FXML
    private void handleDodajButtonClick() {

        Korisnik newKorisnik = new Korisnik("", "", "", "", "");


        model.napuni(newKorisnik);


        model.setTrenutni(newKorisnik);

        // Clear the text fields
        tfIme.clear();
        tfPrezime.clear();
        tfEmail.clear();
        tfUsername.clear();
        pfLozinka.clear();
    }

    @FXML
    private void handleKrajButtonClick() {

        stage.close();

    }

}