package com.icloud.rozycki.bartosz.scene.controll;

import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.layout.VBox;

public class Menu extends VBox {

    private int selectedItem = 0;

    public void selectMenuItem(MenuItem item) {
        ObservableList<Node> children = this.getChildren();
        MenuItem selected = (MenuItem) children.get(selectedItem);

        selectedItem = children.indexOf(item);

        MenuItem next = (MenuItem) children.get(selectedItem);

        selected.setSelected(false);
        next.setSelected(true);
        next.requestFocus();
    }

    public void nextMenuItem() {
        ObservableList<Node> children = this.getChildren();
        MenuItem selected = (MenuItem) children.get(selectedItem);

        if (++selectedItem >= children.size()) {
            selectedItem = 0;
        }

        MenuItem next = (MenuItem) children.get(selectedItem);

        selected.setSelected(false);
        next.setSelected(true);
        next.requestFocus();
    }

    public void prevMenuItem() {
        ObservableList<Node> children = this.getChildren();
        MenuItem selected = (MenuItem) children.get(selectedItem);

        if (--selectedItem < 0) {
            selectedItem = children.size() - 1;
        }

        MenuItem prev = (MenuItem) children.get(selectedItem);

        selected.setSelected(false);
        prev.setSelected(true);
        prev.requestFocus();
    }

}
