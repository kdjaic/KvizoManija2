package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import java.io.IOException;
import java.sql.*;

public class NuVrijController {

    /**
     * Button za povratak na prethodnu stranicu
     */
    @FXML  Button btnPovratak;

    /**
     * Button za povratak na pocetnu stranicu
     */
    @FXML  Button btnOdjava;

    /**
     * Button za prikaz jaja
     */
    @FXML  Button btnJaja;
    /**
     * Button za prikaz mlijeka
     */
    @FXML  Button btnMlijeko;
    /**
     * Button za prikaz krumpira
     */
    @FXML  Button btnKrumpir;
    /**
     * Button za prikaz povrca
     */
    @FXML  Button btnPovrce;
    /**
     * Button za prikaz masnoca
     */
    @FXML  Button btnMasnoce;
    /**
     * Button za prikaz ribe
     */
    @FXML  Button btnRiba;
    /**
     * Button za prikaz mesa
     */
    @FXML  Button btnMeso;
    /**
     * Button za prikaz voca
     */
    @FXML  Button btnVoce;
    /**
     * Button za prikaz zitarica
     */
    @FXML  Button btnZitarice;

    /**
     * TextArea za prikaz nutritivnih vrijednosti
     */
    @FXML  TextArea lblNuVrij;

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
     * Metoda za povratak na hranu
     * @param
     * @throws IOException
     */
    public void GoPovratak() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/Hrana.fxml"));
        Parent root = loader.load();
        btnPovratak.getScene().setRoot(root);
    }

    /**
     * Metoda za prikaz jaja
     */
    public void GoJaja(){
        lblNuVrij.setText(null);
        Connection conn;
        ResultSet rs;
        PreparedStatement ps;
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:KvizoManija.db");
            ps = conn.prepareStatement("select Jaja from NutritivneVrijednosti");
            rs = ps.executeQuery();
            while (rs.next()){
                String s = rs.getString("Jaja");
                if (s == null){
                    s = " ";
                }
                lblNuVrij.appendText(s + "\n");
            }
        } catch (Exception ex){
            lblNuVrij.setText("Greška");
        }
    }

    /**
     * Metoda za prikaz mlijeka
     */
    public void GoMlijeko(){
        lblNuVrij.setText(null);
        Connection conn;
        ResultSet rs;
        PreparedStatement ps;
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:KvizoManija.db");
            ps = conn.prepareStatement("select Mlijeko from NutritivneVrijednosti");
            rs = ps.executeQuery();
            while (rs.next()){
                String s = rs.getString("Mlijeko");
                if (s == null){
                    s = " ";
                }
                lblNuVrij.appendText(s + "\n");
            }
        } catch (Exception ex){
            lblNuVrij.setText("Greška");
        }
    }

    /**
     * Metoda za prikaz krumpira
     */
    public void GoKrumpir(){
        lblNuVrij.setText(null);
        Connection conn;
        ResultSet rs;
        PreparedStatement ps;
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:KvizoManija.db");
            ps = conn.prepareStatement("select Krumpir from NutritivneVrijednosti");
            rs = ps.executeQuery();
            while (rs.next()){
                String s = rs.getString("Krumpir");
                if (s == null){
                    s = " ";
                }
                lblNuVrij.appendText(s + "\n");
            }
        } catch (Exception ex){
            lblNuVrij.setText("Greška");
        }
    }

    /**
     * Metoda za prikaz povrća
     */
    public void GoPovrce(){
        lblNuVrij.setText(null);
        Connection conn;
        ResultSet rs;
        PreparedStatement ps;
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:KvizoManija.db");
            ps = conn.prepareStatement("select Povrce from NutritivneVrijednosti");
            rs = ps.executeQuery();
            while (rs.next()){
                String s = rs.getString("Povrce");
                if (s == null){
                    s = " ";
                }
                lblNuVrij.appendText(s + "\n");
            }
        } catch (Exception ex){
            lblNuVrij.setText("Greška");
        }
    }

    /**
     * Metoda za prikaz masnoća
     */
    public void GoMasnoce(){
        lblNuVrij.setText(null);
        Connection conn;
        ResultSet rs;
        PreparedStatement ps;
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:KvizoManija.db");
            ps = conn.prepareStatement("select Masnoce from NutritivneVrijednosti");
            rs = ps.executeQuery();
            while (rs.next()){
                String s = rs.getString("Masnoce");
                if (s == null){
                    s = " ";
                }
                lblNuVrij.appendText(s + "\n");
            }
        } catch (Exception ex){
            lblNuVrij.setText("Greška");
        }
    }

    /**
     * Metoda za prikaz riba
     */
    public void GoRiba(){
        lblNuVrij.setText(null);
        Connection conn;
        ResultSet rs;
        PreparedStatement ps;
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:KvizoManija.db");
            ps = conn.prepareStatement("select Riba from NutritivneVrijednosti");
            rs = ps.executeQuery();
            while (rs.next()){
                String s = rs.getString("Riba");
                if (s == null){
                    s = " ";
                }
                lblNuVrij.appendText(s + "\n");
            }
        } catch (Exception ex){
            lblNuVrij.setText("Greška");
        }
    }

    /**
     * Metoda za prikaz mesa
     */
    public void GoMeso(){
        lblNuVrij.setText(null);
        Connection conn;
        ResultSet rs;
        PreparedStatement ps;
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:KvizoManija.db");
            ps = conn.prepareStatement("select Meso from NutritivneVrijednosti");
            rs = ps.executeQuery();
            while (rs.next()){
                String s = rs.getString("Meso");
                if (s == null){
                    s = " ";
                }
                lblNuVrij.appendText(s + "\n");
            }
        } catch (Exception ex){
            lblNuVrij.setText("Greška");
        }
    }

    /**
     * Metoda za prikaz voća
     */
    public void GoVoce(){
        lblNuVrij.setText(null);
        Connection conn;
        ResultSet rs;
        PreparedStatement ps;
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:KvizoManija.db");
            ps = conn.prepareStatement("select Voce from NutritivneVrijednosti");
            rs = ps.executeQuery();
            while (rs.next()){
                String s = rs.getString("Voce");
                if (s == null){
                    s = " ";
                }
                lblNuVrij.appendText(s + "\n");
            }
        } catch (Exception ex){
            lblNuVrij.setText("Greška");
        }
    }

    /**
     * Metoda za prikaz žitarica
     */
    public void GoZitarice(){
        lblNuVrij.setText(null);
        Connection conn;
        ResultSet rs;
        PreparedStatement ps;
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:KvizoManija.db");
            ps = conn.prepareStatement("select Zitarice from NutritivneVrijednosti");
            rs = ps.executeQuery();
            while (rs.next()){
                String s = rs.getString("Zitarice");
                if (s == null){
                    s = " ";
                }
                lblNuVrij.appendText(s + "\n");
            }
        } catch (Exception ex){
            lblNuVrij.setText("Greška");
        }
    }

}
