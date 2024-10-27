module io.github.otavioborgsm.primeiroprojeto {
    requires javafx.controls;
    requires javafx.fxml;


    opens io.github.otavioborgsm.primeiroprojeto to javafx.fxml;
    exports io.github.otavioborgsm.primeiroprojeto;
}