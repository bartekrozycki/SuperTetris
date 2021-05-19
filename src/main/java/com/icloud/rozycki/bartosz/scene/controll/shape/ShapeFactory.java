package com.icloud.rozycki.bartosz.scene.controll.shape;

import com.icloud.rozycki.bartosz.scene.controll.shape.model.LShape;

public class ShapeFactory {

    public static IShape getShape(ShapeType type) {
        if (type == ShapeType.ShapeTypeL) {
            return new LShape();
        }
        return new LShape();
    }

}
