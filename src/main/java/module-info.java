module com.example.toplutasimaprojesi {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires org.json;
    requires jdk.jsobject;
    requires javafx.graphics;

    opens com.example.toplutasimaprojesi to javafx.fxml;
    exports com.example.toplutasimaprojesi;
}
