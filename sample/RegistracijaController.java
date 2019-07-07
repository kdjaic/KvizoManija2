package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * Klasa koja služi za registraciju korisnika
 */

public class RegistracijaController implements Initializable {

    /**
     * TextField za upis korisničkog imena
     */
    @FXML
    TextField KorisnickoIme;

    /**
     * PasswordField za upis lozinke
     */
    @FXML
    PasswordField Lozinka;

    /**
     * TextField za upis imena
     */
    @FXML
    TextField Ime;

    /**
     * TextField za upis prezimena
     */
    @FXML
    TextField Prezime;

    /**
     * TextField za upis godina
     */
    @FXML
    TextField Dob;


    /**
     * ToggleGroup sadrži atribute odabira spola
     */
    @FXML
    ToggleGroup spolOdabir;

    /**
     * RadioButton za odabir spola
     */
    @FXML
    RadioButton rbtnMusko;

    /**
     * RadioButton za odabir spola
     */
    @FXML
    RadioButton rbtnZensko;

    /**
     * Label za ispis obavjesti
     */
    @FXML
    Label lblReg;

    /**
     * Button za potvrdu registracije
     */
    @FXML
    Button potvrdi;
    /**
     * Button za povratak na login prozor
     */
    @FXML
    Button btnIzlaz;


    private Connection conn = null;
    private PreparedStatement pst = null;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        rbtnMusko.setToggleGroup(spolOdabir);
        rbtnZensko.setToggleGroup(spolOdabir);
        conn = SqliteConnection.connection();
    }

    /**
     * Metoda za povratak na login prozor
     * @throws IOException
     */
    public void goToLogin() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/Prijava.fxml"));
        Parent root = loader.load();
        btnIzlaz.getScene().setRoot(root);
    }

    @FXML
    public void potvrdiF(ActionEvent event) throws SQLException {
        String sql = "insert into Korisnik(Ime, Prezime, Dob, Spol, KorisnickoIme, Lozinka) values(?,?,?,?,?,?)";
        String tmpIme;
        String tmpPrezime;
        String tmpDob;
        String tmpSpol;
        String tmpKorIme;
        String tmpLozinka;

        tmpIme = Ime.getText();
        tmpPrezime = Prezime.getText();
        tmpDob = Dob.getText();

        if (spolOdabir.getSelectedToggle() == rbtnMusko) {
            tmpSpol = "Musko";
        } else {
            tmpSpol = "Zensko";
        }

        tmpKorIme = KorisnickoIme.getText();
        tmpLozinka = Lozinka.getText();

        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, tmpIme);
            pst.setString(2, tmpPrezime);
            pst.setString(3, tmpDob);
            pst.setString(4, tmpSpol);
            pst.setString(5, tmpKorIme);
            pst.setString(6, tmpLozinka);

            int i = pst.executeUpdate();
            if (i == 1) {
                lblReg.setText("Uspješno ste registrirani");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            pst.close();
        }
    }

}
