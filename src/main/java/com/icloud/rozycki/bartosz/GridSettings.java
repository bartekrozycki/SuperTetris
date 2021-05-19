package com.icloud.rozycki.bartosz;

public class GridSettings {
    private static final int squareSize = 30;
    private static final int widthItems = 12;
    private static final int heightItems = 24;
    private static final int width = getSquareSize() * widthItems;
    private static final int height = getSquareSize() * heightItems;

    public static int getSquareSize() {
        return squareSize;
    }

    public static int getWidthItems() {
        return widthItems;
    }

    public static int getHeightItems() {
        return heightItems;
    }

    public static int getWidth() {
        return width;
    }

    public static int getHeight() {
        return height;
    }
}
