module com.example.retoconjuntodiad2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;


    opens com.example.retoconjuntodiad2 to javafx.fxml;
    exports com.example.retoconjuntodiad2;
}