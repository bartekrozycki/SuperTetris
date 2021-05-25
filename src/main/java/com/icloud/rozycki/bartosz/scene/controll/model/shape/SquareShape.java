package com.icloud.rozycki.bartosz.scene.controll.model.shape;

import com.icloud.rozycki.bartosz.scene.controll.model.shape.util.Shape;
import javafx.scene.paint.Color;

public class SquareShape extends Shape {
    public SquareShape() {
        super(Color.YELLOW);

        int[][][] pos = {
                {{-1, 0}, {-1, 1}, {0, 0}, {0, 1}},
                {{-1, 0}, {-1, -1}, {0, 0}, {0, -1}},
                {{1, 0}, {1, -1}, {0, 0}, {0, -1}},
                {{1, 0}, {1, 1}, {0, 0}, {0, 1}},
        };
        this.setPosition(pos);
    }
}
