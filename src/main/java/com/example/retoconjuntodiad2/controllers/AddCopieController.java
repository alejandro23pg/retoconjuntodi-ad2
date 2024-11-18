package com.example.retoconjuntodiad2.controllers;

import com.example.retoconjuntodiad2.ShowcaseTapesApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class AddCopieController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    @FXML
    public void addCopie(ActionEvent actionEvent) {
    }

    @FXML
    public void back(ActionEvent actionEvent) {
        ShowcaseTapesApplication.loadFXML("main-view.fxml", "Listado de Copias");
    }
}