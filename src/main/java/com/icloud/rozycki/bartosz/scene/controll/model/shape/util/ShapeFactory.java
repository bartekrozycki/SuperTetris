package com.icloud.rozycki.bartosz.scene.controll.model.shape.util;

import com.icloud.rozycki.bartosz.scene.controll.model.shape.LShape;
import com.icloud.rozycki.bartosz.scene.controll.model.shape.LineShape;
import com.icloud.rozycki.bartosz.scene.controll.model.shape.SquareShape;
import com.icloud.rozycki.bartosz.scene.controll.model.shape.ZShape;

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
        return new SquareShape();
    }

}
