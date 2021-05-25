package com.icloud.rozycki.bartosz.controller;

import com.icloud.rozycki.bartosz.App;
import com.icloud.rozycki.bartosz.GridSettings;
import com.icloud.rozycki.bartosz.scene.controll.model.shape.util.IShape;
import com.icloud.rozycki.bartosz.scene.controll.model.shape.util.ShapeFactory;
import com.icloud.rozycki.bartosz.scene.controll.model.shape.util.ShapeType;
import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class GameController extends AnimationTimer implements Initializable {

    public AnchorPane root;
    public Pane gamePane;
    public Label frameRateLabel;
    IShape x;

    List<IShape> shapeList = new ArrayList<>();
    private long lastUpdate = 0;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.root.setPrefHeight(GridSettings.getHeight());
        this.root.setPrefWidth(GridSettings.getWidth());

        this.frameRateLabel.snapPositionX(0);
        this.frameRateLabel.snapPositionY(0);

        App.scene.setOnKeyPressed(this::keyPressedEvent);


        int temp = 0;
        for (ShapeType type : ShapeType.values()) {
            IShape object = ShapeFactory.getShape(type);
            this.gamePane.getChildren().add((Node) object);
            object.draw(2, temp);
            temp += 4;
            shapeList.add(object);
        }

        this.start();
    }

    @FXML
    public void keyPressedEvent(KeyEvent keyEvent) {
        System.out.println(keyEvent.getCode());
        switch (keyEvent.getCode()) {
            case S:
                for (IShape iShape : shapeList)
                    iShape.move(0, 1);
                break;
            case A:
                for (IShape iShape : shapeList)
                    iShape.move(-1, 0);
                break;
            case D:
                for (IShape iShape : shapeList)
                    iShape.move(1, 0);
                break;
            case X:
                for (IShape iShape : shapeList)
                    iShape.rotate();
                break;
        }
    }

    @Override
    public void handle(long now) {
        if ((now - lastUpdate) >= (1_000_000 * 500)) { // 1_000_000 <=> 1ms
            for (IShape iShape : this.shapeList) {
                iShape.move(0, 1);
            }
            lastUpdate = now;
        }
    }
}
