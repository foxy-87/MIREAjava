package mirea.pract3;

class Circle extends Shape{

    protected double radius;

    public Circle(){
        radius = 0;
        color = "neither";
        filled = false;
    }

    public Circle(double inpradius){
        radius = inpradius;
        color = "neither";
        filled = false;
    }

    public Circle(double inpradius, String inpcolor, boolean inpfilled){
        radius = inpradius;
        color = inpcolor;
        filled = inpfilled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double setArea() {
        return 3.14 * radius * radius;
    }

    double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    public String toString() {
        return "Круг:" + "\n Радиус = " + radius + "\n Цвет = " + color + "\n Наполненность = " + filled;
    }
}
