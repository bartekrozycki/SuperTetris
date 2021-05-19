package com.icloud.rozycki.bartosz.scene.controll.model.shape.util;

import java.util.List;
import java.util.Random;

public enum ShapeType {
    ShapeTypeLine, ShapeTypeSquare, ShapeTypeL, ShapeTypeZ, ShapeTypeS, ShapeTypeT;

    private static final List<ShapeType> VALUES = List.of(values());
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static ShapeType pickRandom() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
