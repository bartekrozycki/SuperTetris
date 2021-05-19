package com.icloud.rozycki.bartosz.scene.controll.model.shape;

import com.icloud.rozycki.bartosz.scene.controll.model.shape.util.IShape;

public class LShape extends Shape implements IShape {
    public LShape() {
        int[][][] pos = {
                {{0, -1}, {0, 0}, {0, 1}, {1, -1}},
                {{-1, 0}, {0, 0}, {1, 0}, {1, 1}},
                {{0, -1}, {0, 0}, {0, 1}, {-1, 1}},
                {{1, 0}, {0, 0}, {-1, 0}, {-1, -1}},
        };
        this.setPosition(pos);
    }
}
