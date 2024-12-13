module org.example.ccbb {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.sql;
    requires java.desktop;

    opens org.example.ccbb to javafx.fxml;
    exports org.example.ccbb;
}