package com.example.retoconjuntodiad2.controllers;

import com.example.retoconjuntodiad2.ShowcaseTapesApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    private static final String USER = "Alejandro";
    private static final String PASSWORD = "12345";

    @FXML
    private CheckBox cbSesion;
    @FXML
    private TextField txtUsuario;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private Label txtInfo;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    @FXML
    public void cerrarApp(ActionEvent actionEvent) {
        System.exit(0);
    }

    @FXML
    public void login(ActionEvent actionEvent) {

        String textoSesion = (cbSesion.isSelected()) ? "(Mantener sesión)":"(No mantener sesión)";

        if ( txtUsuario.getText().equals(USER) && txtPassword.getText().equals(PASSWORD) ) {
            ShowcaseTapesApplication.loadFXML("main-view.fxml", "Listado de Copias"/* - " + txtUsuario.getText() + " " + textoSesion*/);
        } else {
            txtInfo.setText("Usuario o contraseña incorrecto");
            txtInfo.setStyle("-fx-background-color: red; -fx-text-fill: white");
        }
    }
}