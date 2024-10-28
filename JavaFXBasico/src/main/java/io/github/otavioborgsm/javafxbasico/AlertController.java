package io.github.otavioborgsm.javafxbasico;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class AlertController {

    @FXML
    private Button btnAbrirAlert;

    @FXML
    void abrirAlert() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Titulo Teste");
        alert.setHeaderText("Cabeçalho teste");
        alert.setContentText("Conteúdo");
        alert.show();
    }

}
