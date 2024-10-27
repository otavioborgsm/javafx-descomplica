module io.github.otavioborgsm.javafxbasico {
    requires javafx.controls;
    requires javafx.fxml;


    opens io.github.otavioborgsm.javafxbasico to javafx.fxml;
    exports io.github.otavioborgsm.javafxbasico;
}