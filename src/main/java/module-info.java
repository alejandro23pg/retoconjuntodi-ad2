module com.example.retoconjuntodiad2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;
    requires org.hibernate.orm.core;
    requires jakarta.persistence;


    opens com.example.retoconjuntodiad2 to javafx.fxml;
    exports com.example.retoconjuntodiad2;
    exports com.example.retoconjuntodiad2.controllers;
    opens com.example.retoconjuntodiad2.controllers to javafx.fxml;
}