package com.icloud.rozycki.bartosz.scene.controll.model.shape;

import com.icloud.rozycki.bartosz.scene.controll.model.shape.util.IShape;
import javafx.scene.paint.Color;

public class ZShape extends Shape implements IShape {
    public ZShape() {
        super(Color.LAWNGREEN);

        int[][][] pos = {
                {{0, -1}, {0, 0}, {-1, 0}, {-1, 1}},
                {{0, -1}, {0, 0}, {1, 0}, {-1, -1}},
                {{0, 1}, {0, 0}, {1, 0}, {1, -1}},
                {{-1, 0}, {0, 0}, {0, 1}, {1, 1}},
        };
        this.setPosition(pos);
    }
}
