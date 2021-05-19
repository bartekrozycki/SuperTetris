package com.icloud.rozycki.bartosz.scene.controll.model.shape.util;

import com.icloud.rozycki.bartosz.scene.controll.model.shape.LShape;

public class ShapeFactory {

    public static IShape getShape(ShapeType type) {
        if (type == ShapeType.ShapeTypeL) {
            return new LShape();
        }
        return new LShape();
    }

}
