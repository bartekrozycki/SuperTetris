package com.icloud.rozycki.bartosz.scene.controll.model.shape.util;

import com.icloud.rozycki.bartosz.scene.controll.model.shape.*;

public class ShapeFactory {

    public static IShape getShape(ShapeType type) {
        if (type == ShapeType.ShapeTypeL) {
            return new LShape();
        }
        else if (type == ShapeType.ShapeTypeLine) {
            return new LineShape();
        }
        else if (type == ShapeType.ShapeTypeSquare) {
            return new SquareShape();
        }
        else if (type == ShapeType.ShapeTypeZ) {
            return new ZShape();
        }
        else if (type == ShapeType.ShapeTypeS) {
            return new SShape();
        }
        else if (type == ShapeType.ShapeTypeT) {
            return new TShape();
        }
        return new SquareShape();
    }

}
