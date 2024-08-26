module com.example.encapsulamiento {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.encapsulamiento to javafx.fxml;
    exports com.example.encapsulamiento;
}