package com.icloud.rozycki.bartosz.scene.controll.model;

import com.icloud.rozycki.bartosz.GridSettings;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

public class Block extends Rectangle {
    public Block(Paint paint) {
        this.setWidth(30);
        this.setHeight(30);
        this.setFill(paint);
        this.setStroke(Color.BLACK);
        this.setStrokeWidth(2.0);
    }

    public void setColumn(double col) {
        this.setLayoutX(col * GridSettings.getSquareSize());
    }

    public void setRow(double row) {
        this.setLayoutY(row * GridSettings.getSquareSize());
    }

    public void setGridPosition(double col, double row) {
        this.setColumn(col);
        this.setRow(row);
    }

}
