package io.github.otavioborgsm.javafxbasico;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;

public class CheckBoxController {

    @FXML
    private CheckBox cbJava;

    @FXML
    private CheckBox cbPHP;

    @FXML
    void pegarValores() {
        System.out.println(cbJava.selectedProperty().getValue());
        System.out.println(cbPHP.selectedProperty().getValue());
    }

}