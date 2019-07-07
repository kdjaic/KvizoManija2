package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 * Klasa koja sadrži metode za prikaz gl.gradova i država
 */

public class GlGradDrzController {

    /**
     * Button za povratak na prethodnu stranicu
     */
    @FXML  Button btnPovratak;

    /**
     * Button za povratak na pocetnu stranicu
     */
    @FXML  Button btnOdjava;

    /**
     * Button za prikaz gl.gradova i država
     */
    @FXML  Button btnGlGradDrz;

    /**
     * TextArea za prikaz gl. gradova i drzava
     */
    @FXML
    TextArea txtGlGradDrz;


    /**
     * Metoda za odjavu
     * @throws Exception
     */
    public void GoOdjava() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/sample.fxml"));
        Parent root = loader.load();
        btnOdjava.getScene().setRoot(root);
    }

    /**
     * Metoda za povratak na geografiju
     * @param
     * @throws IOException
     */
    public void GoPovratak() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/Geografija.fxml"));
        Parent root = loader.load();
        btnPovratak.getScene().setRoot(root);
    }

    /**
     * Metoda za prikaz gl. gradova i drzava
     */
    public void PrikaziGlGradDrz(){
        txtGlGradDrz.setText(null);
        Connection conn;
        ResultSet rs;
        PreparedStatement ps;
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:KvizoManija.db");
            ps = conn.prepareStatement("select glgraddrz from GlGradDrzave");
            rs = ps.executeQuery();
            while (rs.next()){
                String s = rs.getString("glgraddrz");
                if (s == null){
                    s = " ";
                }
                txtGlGradDrz.appendText(s + "\n");
            }
        } catch (Exception ex){
            txtGlGradDrz.setText("Greška");
        }
    }


}
