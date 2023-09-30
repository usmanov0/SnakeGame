module com.demo1.snakegamedemo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.datatransfer;
    requires java.desktop;


    opens com.demo1.snakegamedemo to javafx.fxml;
    exports com.demo1.snakegamedemo;
}