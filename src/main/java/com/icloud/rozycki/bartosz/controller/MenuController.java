package com.icloud.rozycki.bartosz.controller;

import com.icloud.rozycki.bartosz.App;
import com.icloud.rozycki.bartosz.GridSettings;
import com.icloud.rozycki.bartosz.scene.controll.Menu;
import com.icloud.rozycki.bartosz.scene.controll.MenuItem;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class MenuController implements Initializable {

    @FXML
    public AnchorPane root;
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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.root.setPrefWidth(GridSettings.getWidth());
        this.root.setPrefHeight(GridSettings.getHeight());
    }

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

    public void QuitAction() {
        Stage stage = (Stage) quitButton.getScene().getWindow();
        stage.close();
    }

    public void StartGame() {
        try {
            App.setRoot("GameLayout");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
