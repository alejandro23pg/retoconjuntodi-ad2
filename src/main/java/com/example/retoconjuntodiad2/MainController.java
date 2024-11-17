package com.example.retoconjuntodiad2;

import com.example.retoconjuntodiad2.models.Copie;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private TableView<Copie> tableCopies;
    @FXML
    private TableColumn<Copie, String> cTitulo;
    @FXML
    private TableColumn<Copie, String> cGenero;
    @FXML
    private TableColumn<Copie, String> cYear;
    @FXML
    private TableColumn<Copie, String> cDirector;
    @FXML
    private TableColumn<Copie, String> cSoporte;
    @FXML
    private TableColumn<Copie, String> cEstado;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cTitulo.setCellValueFactory( (fila)->{
            return new SimpleStringProperty(fila.getValue().getId_pelicula().toString());
        });
        cGenero.setCellValueFactory( (fila)->{
            return new SimpleStringProperty(fila.getValue().getId_pelicula().toString());
        });
        cYear.setCellValueFactory( (fila)->{
            return new SimpleStringProperty(fila.getValue().getId_pelicula().toString());
        });
        cDirector.setCellValueFactory( (fila)->{
            return new SimpleStringProperty(fila.getValue().getId_pelicula().toString());
        });
        cSoporte.setCellValueFactory( (fila)->{
            return new SimpleStringProperty(fila.getValue().getEstado());
        });
        cEstado.setCellValueFactory( (fila)->{
            return new SimpleStringProperty(fila.getValue().getSoporte());
        });

        tableCopies.getItems().clear();
    }

    @javafx.fxml.FXML
    public void logout(ActionEvent actionEvent) {
        HelloApplication.loadFXML("login-view.fxml", "ShowcaseTapes");
    }

    @javafx.fxml.FXML
    public void cerrarApp(ActionEvent actionEvent) {
        System.exit(0);
    }

    @FXML
    public void addCopie(ActionEvent actionEvent) {
        HelloApplication.loadFXML("addCopie-view.fxml", "Nueva copia");
    }
}