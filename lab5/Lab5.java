package mirea.lab5;

import javax.swing.*;
import java.awt.*;

public class Lab5 extends JFrame {
    int WIDTH = 5;
    int HEIGHT = 4;
    int random = 0;
    boolean check = true;

    Lab5() {
        super("Lab 5");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(740, 700);
        setVisible(true);
    }

    public void paint(Graphics g) {
        if(check == true) {
            for (int i = 0; i < 20; i++) {
                random = (int) (100 * Math.random() % 2);
                switch (random) {
                    case (0):
                        Square currentShape = new Square(i % WIDTH, i / HEIGHT);
                        g.setColor(currentShape.getColor());
                        g.fillRect(currentShape.getPosX() * 100 + 50, currentShape.getPosY() * 100 + 100, 50, 50);
                        break;
                    case (1):
                        Circle currentCircle = new Circle(i % WIDTH, i / HEIGHT);
                        g.setColor(currentCircle.getColor());
                        g.fillOval(currentCircle.getPosX() * 100 + 50, currentCircle.getPosY() * 100 + 100, 60, 60);
                        break;
                }
                if(i == 19){
                    check = false;
                }
                System.out.println(random);
            }
        }


    }

    public static void main(String[] args) {
        new Lab5();
    }
}
