package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import java.io.IOException;

public class GeografijaController {

    @FXML
    private Button btnOdjava;

    @FXML
    private Button btnPovratak;

    @FXML
    private Button btnPozGeo;

    @FXML
    private Button btnGlGrDr;

    public void GoOdjava() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/sample.fxml"));
        Parent root = loader.load();
        btnOdjava.getScene().setRoot(root);
    }

    public void GoPovratak() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/Pocetna.fxml"));
        Parent root = loader.load();
        btnPovratak.getScene().setRoot(root);
    }

    public void GoPozGeo() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/PozGeografi.fxml"));
        Parent root = loader.load();
        btnPozGeo.getScene().setRoot(root);
    }

    public void GoGlGradDrz() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/GlGradDrz.fxml"));
        Parent root = loader.load();
        btnGlGrDr.getScene().setRoot(root);
    }
}
