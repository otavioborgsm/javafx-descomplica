package io.github.otavioborgsm.javafxbasico;


import io.github.otavioborgsm.javafxbasico.model.Categoria;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ListViewController implements Initializable {

    @FXML
    private ListView<Categoria> lvCategorias;

    private List<Categoria> categorias = new ArrayList<>();

    private ObservableList<Categoria> obsCategorias;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        carregarCategorias();
    }

    public void carregarCategorias(){
        Categoria categoria1 = new Categoria(1, "Comidas");
        Categoria categoria2 = new Categoria(2, "Bebidas");

        categorias.add(categoria1);
        categorias.add(categoria2);

        obsCategorias = FXCollections.observableArrayList(categorias);

        lvCategorias.setItems(obsCategorias);
    }
}
