package GUI.zadanie_11_01;

import java.awt.*;

public class Shape {
    boolean isCircle;
    int x;
    int y;
    int size;
    Color color;
    boolean isFilled;

    public Shape(boolean isCircle, int x, int y, int size, Color color, boolean isFilled) {
        this.isCircle = isCircle;
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
        this.isFilled = isFilled;
    }
}
