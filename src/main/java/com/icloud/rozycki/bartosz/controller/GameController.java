package com.icloud.rozycki.bartosz.controller;

import com.icloud.rozycki.bartosz.App;
import com.icloud.rozycki.bartosz.GridSettings;
import com.icloud.rozycki.bartosz.scene.controll.model.shape.util.IShape;
import com.icloud.rozycki.bartosz.scene.controll.model.shape.util.ShapeFactory;
import com.icloud.rozycki.bartosz.scene.controll.model.shape.util.ShapeType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class GameController implements Initializable {

    public AnchorPane root;
    public Pane gamePane;
    IShape x;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.root.setPrefHeight(GridSettings.getHeight());
        this.root.setPrefWidth(GridSettings.getWidth());

        App.scene.setOnKeyPressed(this::keyPressedEvent);

        x = ShapeFactory.getShape(ShapeType.ShapeTypeL);
        ((Node) x).addEventFilter(KeyEvent.KEY_PRESSED, this::keyPressedEvent);
        this.gamePane.getChildren().add((Node) x);
        x.draw(0,0);
    }

    @FXML
    public void keyPressedEvent(KeyEvent keyEvent) {
        System.out.println(keyEvent.getCode());
        switch (keyEvent.getCode()) {
            case W:
                x.move(0, -1);
                break;
            case S:
                x.move(0, 1);
                break;
            case A:
                x.move(-1, 0);
                break;
            case D:
                x.move(1,0);
                break;
            case X:
                x.rotate();
        }
    }
}
