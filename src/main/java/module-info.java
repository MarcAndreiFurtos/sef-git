module com.example.demoer {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demoer to javafx.fxml;
    exports com.example.demoer;
}