package io.github.otavioborgsm.javafxbasico;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

import java.net.URL;
import java.util.ResourceBundle;

public class RadioButtonController implements Initializable {

    @FXML
    private ToggleGroup grupo;

    @FXML
    void pegarSelecionado() {
        RadioButton radio = (RadioButton) grupo.getSelectedToggle();
        System.out.println(radio.getText());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
