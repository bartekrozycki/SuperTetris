package com.icloud.rozycki.bartosz.scene.controll.model.shape.util;

public interface IShape {
    void draw(int x, int y);
    void move(int dCol, int dRow);
    void destroy();
    void rotate();
    void update();
}
