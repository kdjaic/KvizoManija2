package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import java.io.IOException;
import java.sql.*;

public class PovKalController {

    @FXML
    private Button btnOdjava;

    @FXML
    private Button btnPovratak;

    /**
     * Button za prikaz sijecnja
     */
    @FXML  Button btnSijecanj;

    /**
     * Button za prikaz veljace
     */
    @FXML  Button btnVeljaca;

    /**
     * Button za prikaz ozujka
     */
    @FXML  Button btnOzujak;

    /**
     * Button za prikaz travnja
     */
    @FXML  Button btnTravanj;

    /**
     * Button za prikaz svibnja
     */
    @FXML  Button btnSvibanj;

    /**
     * Button za prikaz lipnja
     */
    @FXML  Button btnLipanj;

    /**
     * Button za prikaz srpnja
     */
    @FXML  Button btnSrpanj;

    /**
     * Button za prikaz kolovoza
     */
    @FXML  Button btnKolovoz;

    /**
     * Button za prikaz rujna
     */
    @FXML  Button btnRujan;

    /**
     * Button za prikaz listopada
     */
    @FXML  Button btnListopad;

    /**
     * Button za prikaz studenog
     */
    @FXML  Button btnStudeni;

    /**
     * Button za prikaz prosinca
     */
    @FXML  Button btnProsinac;

    /**
     * TextArea za prikaz mjeseci
     */
    @FXML  TextArea lblText;

    public void GoOdjava() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/sample.fxml"));
        Parent root = loader.load();
        btnOdjava.getScene().setRoot(root);
    }

    public void GoPovratak() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/Povijest.fxml"));
        Parent root = loader.load();
        btnPovratak.getScene().setRoot(root);
    }

    /**
     * Metoda za prikaz sijecnja
     */
    public void prikaziSijecanj(){
        lblText.setText(null);
        Connection conn;
        ResultSet rs;
        PreparedStatement ps;
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:KvizoManija.db");
            ps = conn.prepareStatement("select sijecanj from Mjeseci");
            rs = ps.executeQuery();
            while (rs.next()){
                String s = rs.getString("sijecanj");
                if (s == null){
                    s = " ";
                }
                lblText.appendText(s + "\n");
            }
        } catch (Exception ex){
            lblText.setText("Greška");
        }
    }

    /**
     * Metoda za prikaz veljace
     */
    public void prikaziVeljaca(){
        lblText.setText(null);
        Connection conn;
        ResultSet rs;
        PreparedStatement ps;
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:KvizoManija.db");
            ps = conn.prepareStatement("select veljaca from Mjeseci");
            rs = ps.executeQuery();
            while (rs.next()){
                String s = rs.getString("veljaca");
                if (s == null){
                    s = " ";
                }
                lblText.appendText(s + "\n");
            }
        } catch (Exception ex){
            lblText.setText("Greška");
        }
    }

    /**
     * Metoda za prikaz ozujka
     */
    public void prikaziOzujak(){
        lblText.setText(null);
        Connection conn;
        ResultSet rs;
        PreparedStatement ps;
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:KvizoManija.db");
            ps = conn.prepareStatement("select ozujak from Mjeseci");
            rs = ps.executeQuery();
            while (rs.next()){
                String s = rs.getString("ozujak");
                if (s == null){
                    s = " ";
                }
                lblText.appendText(s + "\n");
            }
        } catch (Exception ex){
            lblText.setText("Greška");
        }
    }

    /**
     * Metoda za prikaz travnja
     */
    public void prikaziTravanj(){
        lblText.setText(null);
        Connection conn;
        ResultSet rs;
        PreparedStatement ps;
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:KvizoManija.db");
            ps = conn.prepareStatement("select travanj from Mjeseci");
            rs = ps.executeQuery();
            while (rs.next()){
                String s = rs.getString("travanj");
                if (s == null){
                    s = " ";
                }
                lblText.appendText(s + "\n");
            }
        } catch (Exception ex){
            lblText.setText("Greška");
        }
    }

    /**
     * Metoda za prikaz svibnja
     */
    public void prikaziSvibanj(){
        lblText.setText(null);
        Connection conn;
        ResultSet rs;
        PreparedStatement ps;
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:KvizoManija.db");
            ps = conn.prepareStatement("select svibanj from Mjeseci");
            rs = ps.executeQuery();
            while (rs.next()){
                String s = rs.getString("svibanj");
                if (s == null){
                    s = " ";
                }
                lblText.appendText(s + "\n");
            }
        } catch (Exception ex){
            lblText.setText("Greška");
        }
    }

    /**
     * Metoda za prikaz lipnja
     */
    public void prikaziLipanj(){
        lblText.setText(null);
        Connection conn;
        ResultSet rs;
        PreparedStatement ps;
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:KvizoManija.db");
            ps = conn.prepareStatement("select lipanj from Mjeseci");
            rs = ps.executeQuery();
            while (rs.next()){
                String s = rs.getString("lipanj");
                if (s == null){
                    s = " ";
                }
                lblText.appendText(s + "\n");
            }
        } catch (Exception ex){
            lblText.setText("Greška");
        }
    }

    /**
     * Metoda za prikaz srpnja
     */
    public void prikaziSrpanj(){
        lblText.setText(null);
        Connection conn;
        ResultSet rs;
        PreparedStatement ps;
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:KvizoManija.db");
            ps = conn.prepareStatement("select srpanj from Mjeseci");
            rs = ps.executeQuery();
            while (rs.next()){
                String s = rs.getString("srpanj");
                if (s == null){
                    s = " ";
                }
                lblText.appendText(s + "\n");
            }
        } catch (Exception ex){
            lblText.setText("Greška");
        }
    }

    /**
     * Metoda za prikaz kolovoza
     */
    public void prikaziKolovoz(){
        lblText.setText(null);
        Connection conn;
        ResultSet rs;
        PreparedStatement ps;
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:KvizoManija.db");
            ps = conn.prepareStatement("select kolovoz from Mjeseci");
            rs = ps.executeQuery();
            while (rs.next()){
                String s = rs.getString("kolovoz");
                if (s == null){
                    s = " ";
                }
                lblText.appendText(s + "\n");
            }
        } catch (Exception ex){
            lblText.setText("Greška");
        }
    }

    /**
     * Metoda za prikaz rujna
     */
    public void prikaziRujan(){
        lblText.setText(null);
        Connection conn;
        ResultSet rs;
        PreparedStatement ps;
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:KvizoManija.db");
            ps = conn.prepareStatement("select rujan from Mjeseci");
            rs = ps.executeQuery();
            while (rs.next()){
                String s = rs.getString("rujan");
                if (s == null){
                    s = " ";
                }
                lblText.appendText(s + "\n");
            }
        } catch (Exception ex){
            lblText.setText("Greška");
        }
    }

    /**
     * Metoda za prikaz listopada
     */
    public void prikaziListopad(){
        lblText.setText(null);
        Connection conn;
        ResultSet rs;
        PreparedStatement ps;
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:KvizoManija.db");
            ps = conn.prepareStatement("select listopad from Mjeseci");
            rs = ps.executeQuery();
            while (rs.next()){
                String s = rs.getString("listopad");
                if (s == null){
                    s = " ";
                }
                lblText.appendText(s + "\n");
            }
        } catch (Exception ex){
            lblText.setText("Greška");
        }
    }

    /**
     * Metoda za prikaz studenog
     */
    public void prikaziStudeni(){
        lblText.setText(null);
        Connection conn;
        ResultSet rs;
        PreparedStatement ps;
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:KvizoManija.db");
            ps = conn.prepareStatement("select studeni from Mjeseci");
            rs = ps.executeQuery();
            while (rs.next()){
                String s = rs.getString("studeni");
                if (s == null){
                    s = " ";
                }
                lblText.appendText(s + "\n");
            }
        } catch (Exception ex){
            lblText.setText("Greška");
        }
    }

    /**
     * Metoda za prikaz prosinca
     */
    public void prikaziProsinac(){
        lblText.setText(null);
        Connection conn;
        ResultSet rs;
        PreparedStatement ps;
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:KvizoManija.db");
            ps = conn.prepareStatement("select prosinac from Mjeseci");
            rs = ps.executeQuery();
            while (rs.next()){
                String s = rs.getString("prosinac");
                if (s == null){
                    s = " ";
                }
                lblText.appendText(s + "\n");
            }
        } catch (Exception ex){
            lblText.setText("Greška");
        }
    }
}
