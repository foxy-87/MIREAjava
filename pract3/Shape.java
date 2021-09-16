package mirea.pract3;

public abstract class Shape {
    protected String  color;
    protected boolean filled;

    public Shape(){

    }

    public Shape(String inpcolor, boolean inpfilled){
        color = inpcolor;
        filled = inpfilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract double setArea();

    abstract double getPerimeter();

    public String toString() {
        return "Цвет= " + color + "\n Наполнение=" + filled;
    }
}