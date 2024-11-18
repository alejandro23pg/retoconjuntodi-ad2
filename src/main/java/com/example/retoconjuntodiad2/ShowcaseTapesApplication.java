package com.example.retoconjuntodiad2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.hibernate.SessionFactory;

import java.io.IOException;

public class ShowcaseTapesApplication extends Application {
    private static Stage ventana;

    @Override
    public void start(Stage stage) throws IOException {
        ShowcaseTapesApplication.ventana = stage;
        loadFXML("login-view.fxml", "ShowcaseTapes");
        stage.show();
    }

    public static void loadFXML(String view, String title) {
        FXMLLoader fxmlLoader = new FXMLLoader(ShowcaseTapesApplication.class.getResource(view));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ventana.setTitle(title);
        ventana.setScene(scene);
        ventana.setResizable(false);
        // ventana.setFullScreen(true);
    }

    public static void main(String[] args) {
        launch();
    }
}