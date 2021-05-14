package com.icloud.rozycki.bartosz.scene.controll.handlers;

import com.icloud.rozycki.bartosz.scene.controll.Menu;
import com.icloud.rozycki.bartosz.scene.controll.MenuItem;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class MenuItemMouseEventHandler implements EventHandler<MouseEvent> {
    @Override
    public void handle(MouseEvent mouseEvent) {
        MenuItem target = (MenuItem) mouseEvent.getTarget();
        Menu parent = (Menu) target.getParent();
        parent.selectMenuItem(target);
    }
}
