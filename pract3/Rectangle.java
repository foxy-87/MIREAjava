package mirea.pract3;

class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(){
        width = 0;
        length = 0;
        color = "neither";
        filled = false;
    }

    public Rectangle(double inpwidth, double inplength){
        width = inpwidth;
        length = inplength;
        color = "neither";
        filled = false;
    }

    public Rectangle(double inpwidth, double inplength, String inpcolor, boolean inpfilled){
        width = inpwidth;
        length = inplength;
        color = inpcolor;
        filled = inpfilled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    double setArea() {
        return width * length;
    }

    double getPerimeter() {
        return 2 * (width + length);
    }

    public String toString() {
        return "Прямоугольник:" + "\n Длина = " + length + "\n Ширина = " + width + "\n Цвет = " + color + "\n Наполнение = " + filled;
    }
}
