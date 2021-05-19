package com.icloud.rozycki.bartosz.scene.controll.shape;

import javafx.scene.Group;
import javafx.scene.paint.Color;

import java.util.Arrays;

public abstract class Shape extends Group implements IShape {
    private Block[] blocks = new Block[4];

    private int[][][] position = {
            {{0, 0}, {0, 0}, {0, 0}, {0, 0}},
            {{0, 0}, {0, 0}, {0, 0}, {0, 0}},
            {{0, 0}, {0, 0}, {0, 0}, {0, 0}},
            {{0, 0}, {0, 0}, {0, 0}, {0, 0}},
    };

    private int rotate = 0;
    private int col;
    private int row;

    public Shape() {
        for (int i = 0; i < blocks.length; i++) {
            blocks[i] = new Block(Color.ORANGE);
            this.getChildren().add(blocks[i]);
        }
        this.setVisible(false);
    }

    protected void setPosition(int[][][] position) {
        this.position = position;
    }

    @Override
    public void draw(int col, int row) {
        this.setVisible(true);
        this.col = col;
        this.row = row;
        this.update();
    }

    @Override
    public void move(int dCol, int dRow) {
        col += dCol;
        row += dRow;
        this.update();
    }

    @Override
    public void destroy() {
        this.setVisible(false);
        this.getChildren().clear();
        Arrays.fill(blocks, null);
        blocks = null;
        position = null;
    }

    @Override
    public void rotate() {
        rotate += 1;
        rotate %= 4;
        this.update();
    }

    @Override
    public void update() {
        for (int i = 0; i < blocks.length; i++) {
            int colPos = col + position[rotate][i][0];
            int rowPos = row + position[rotate][i][1];
            blocks[i].setGridPosition(colPos, rowPos);
        }
    }

}
