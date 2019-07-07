package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * Klasa koja sadrži metode za prijavu i registraciju korisnika
 */

public class PrijavaController implements Initializable{

    /**
     * TextField za upis korisničkog imena
     */
    @FXML TextField txtKorisnickoIme;
    /**
     * PasswordField za upis lozinka
     */
    @FXML PasswordField txtLozinka;
    /**
     * Button za prijavu
     */
    @FXML Button btnPrijava;
    /**
     * Label za ispis greške pri prijavi
     */
    @FXML Label lblGreska;
    /**
     * Button za registraciju
     */
    @FXML Button btnRegistrirajSe;
    /**
     * Label za ispis greške s bazom podataka
     */
    @FXML Label proba;
    /**
     * Instanca klase loginModel za pozivanje metoda
     */
    public PrijavaModel prijavaModel = new PrijavaModel();

    /**
     * Metoda za ispis greške sa bazom podataka
     * @param location
     * @param resources
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if (prijavaModel.isClosed()) {
            proba.setVisible(false);
            proba.setText("radi");
        } else {
            proba.setText("Niste spojeni s bazom podataka");
        }
    }

    /**
     * Metoda za prikaz prozora registracija
     * @throws Exception
     */
    public void registrirajSe() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/Registracija.fxml"));
        Parent root = loader.load();
        btnRegistrirajSe.getScene().setRoot(root);
    }

    /**
     * Metoda za prijavu i otvaranje pocetnog prozora
     * Poziva metodu isLogin za provjeru korisničkog imena i lozinke
     * @throws Exception
     */
    public void prijava() throws Exception {
        try {
            if (prijavaModel.isLogin(txtKorisnickoIme.getText(), txtLozinka.getText())) {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/Pocetna.fxml"));
                Parent root = loader.load();
                btnPrijava.getScene().setRoot(root);
            } else {
                lblGreska.setVisible(true);
                lblGreska.setText("Krivo korisnicko ime ili lozinka");
            }
        } catch (SQLException e) {
            lblGreska.setText("SQL greska");
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }


}
