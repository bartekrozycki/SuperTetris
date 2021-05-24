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
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class GameController implements Initializable {

    public AnchorPane root;
    public Pane gamePane;
    IShape x;

    List<IShape> shapeList = new ArrayList<>();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.root.setPrefHeight(GridSettings.getHeight());
        this.root.setPrefWidth(GridSettings.getWidth());

        App.scene.setOnKeyPressed(this::keyPressedEvent);


        int temp = 0;
        for (ShapeType type : ShapeType.values()) {
            IShape object = ShapeFactory.getShape(type);
//            ((Node) object).addEventFilter(KeyEvent.KEY_PRESSED, this::keyPressedEvent);
            this.gamePane.getChildren().add((Node) object);
            object.draw(2, temp);
            temp += 4;
            shapeList.add(object);
        }

//        x = ShapeFactory.getShape(ShapeType.ShapeTypeSquare);
//        ((Node) x).addEventFilter(KeyEvent.KEY_PRESSED, this::keyPressedEvent);
//        this.gamePane.getChildren().add((Node) x);
//        x.draw(0,0);
    }



    @FXML
    public void keyPressedEvent(KeyEvent keyEvent) {
        System.out.println(keyEvent.getCode());
        switch (keyEvent.getCode()) {
            case W:
                for (IShape iShape : shapeList)
                    iShape.move(0, -1);
                break;
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
                    iShape.move(1,0);
                break;
            case X:
                for (IShape iShape : shapeList)
                    iShape.rotate();
                break;
        }
    }
}
