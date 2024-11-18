package com.example.retoconjuntodiad2.controllers;

import com.example.retoconjuntodiad2.HelloApplication;
import com.example.retoconjuntodiad2.models.Copie;
import com.example.retoconjuntodiad2.models.dto.CopieDTO;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private TableView<CopieDTO> tableCopies;
    @FXML
    private TableColumn<CopieDTO, String> cTitulo;
    @FXML
    private TableColumn<CopieDTO, String> cGenero;
    @FXML
    private TableColumn<CopieDTO, String> cYear;
    @FXML
    private TableColumn<CopieDTO, String> cDirector;
    @FXML
    private TableColumn<CopieDTO, String> cSoporte;
    @FXML
    private TableColumn<CopieDTO, String> cEstado;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cTitulo.setCellValueFactory(new PropertyValueFactory<>("titulo"));
        cGenero.setCellValueFactory(new PropertyValueFactory<>("genero"));
        cYear.setCellValueFactory(new PropertyValueFactory<>("year"));
        cDirector.setCellValueFactory(new PropertyValueFactory<>("director"));
        cSoporte.setCellValueFactory(new PropertyValueFactory<>("soporte"));
        cEstado.setCellValueFactory(new PropertyValueFactory<>("estado"));

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