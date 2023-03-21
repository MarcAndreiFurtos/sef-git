module com.example.demoer {
    requires javafx.controls;
    requires javafx.fxml;


    opens loose.oose.fis.lab.student.manager.demoer to javafx.fxml;
    exports loose.oose.fis.lab.student.manager.demoer;
}