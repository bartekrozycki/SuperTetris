package com.icloud.rozycki.bartosz.scene.controll.model.shape;

import com.icloud.rozycki.bartosz.scene.controll.model.shape.util.IShape;
import javafx.scene.paint.Color;

public class LineShape extends Shape implements IShape {
    public LineShape() {
        super(Color.AQUA);

        int[][][] pos = {
                {{-2, 0}, {-1, 0}, {0, 0}, {1, 0}},
                {{0, -2}, {0, -1}, {0, 0}, {0, 1}},
                {{2, 0}, {1, 0}, {0, 0}, {-1, 0}},
                {{0, -1}, {0, 0}, {0, 1}, {0, 2}},
        };
        this.setPosition(pos);
    }
}
