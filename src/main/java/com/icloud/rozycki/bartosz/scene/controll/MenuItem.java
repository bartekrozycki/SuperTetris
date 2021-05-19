package com.icloud.rozycki.bartosz.scene.controll;

import com.icloud.rozycki.bartosz.scene.controll.handler.MenuItemMouseEventHandler;
import javafx.scene.control.Button;

import static javafx.scene.input.MouseEvent.MOUSE_ENTERED;

public class MenuItem extends Button {

    public boolean isSelected = false;

    public MenuItem() {
        this.addEventHandler(MOUSE_ENTERED, new MenuItemMouseEventHandler());
    }

    public void setSelected(boolean selected) {

        this.getStyleClass().remove("selected");
        isSelected = false;

        if (selected) {
            this.getStyleClass().add("selected");
            isSelected = true;
        }

    }

}
