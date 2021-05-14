package com.icloud.rozycki.bartosz.controllers;

import com.icloud.rozycki.bartosz.scene.controll.Menu;
import com.icloud.rozycki.bartosz.scene.controll.MenuItem;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;


public class MenuController {

    @FXML
    public Menu MenuContainer;
    @FXML
    public MenuItem startButton;
    @FXML
    public MenuItem rankButton;
    @FXML
    public MenuItem settingsButton;
    @FXML
    public MenuItem quitButton;

    @FXML
    public void KeyPressEvent(KeyEvent keyEvent) {

        switch (keyEvent.getCode()) {
            case W:
                MenuContainer.prevMenuItem();
                break;
            case S:
                MenuContainer.nextMenuItem();
                break;
        }

    }

    public void QuitAction(ActionEvent actionEvent) {
        Stage stage = (Stage) quitButton.getScene().getWindow();
        stage.close();
    }
}
