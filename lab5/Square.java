package mirea.lab5;

import java.awt.*;

public class Square extends Shape {
    Square(int posX, int posY) {
        super(posX, posY);
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getPosX() {
        return this.posX;
    }

    public int getPosY() {
        return this.posY;
    }
}
