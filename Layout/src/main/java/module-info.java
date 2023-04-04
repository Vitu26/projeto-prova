module com.projeto {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    opens com.projeto.Layout to javafx.fxml;
    exports com.projeto.Layout;
}