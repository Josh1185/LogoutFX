module com.example.logoutfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;


    opens com.example.logoutfx to javafx.fxml;
    exports com.example.logoutfx;
}