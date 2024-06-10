module org.example.myjavafxapp2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens org.example.myjavafxapp2 to javafx.fxml;
    exports org.example.myjavafxapp2;
}