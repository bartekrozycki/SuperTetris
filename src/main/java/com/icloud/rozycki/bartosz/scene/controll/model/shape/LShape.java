package com.icloud.rozycki.bartosz.scene.controll.model.shape;

import com.icloud.rozycki.bartosz.scene.controll.model.shape.util.IShape;
import com.icloud.rozycki.bartosz.scene.controll.model.shape.util.Shape;
import javafx.scene.paint.Color;

public class LShape extends Shape implements IShape {
    public LShape() {
        super(Color.ORANGE);
        int[][][] pos = {
                {{0, -1}, {0, 0}, {0, 1}, {1, 1}},
                {{1, 0}, {0, 0}, {-1, 0}, {-1, 1}},
                {{0, 1}, {0, 0}, {0, -1}, {-1, -1}},
                {{-1, 0}, {0, 0}, {1, 0}, {1, -1}},
        };
        this.setPosition(pos);
    }
}
