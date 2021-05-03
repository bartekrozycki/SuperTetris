module com.icloud.rozycki.bartosz {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.icloud.rozycki.bartosz to javafx.fxml;
    exports com.icloud.rozycki.bartosz;
}