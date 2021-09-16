package mirea.pract3;

class Square extends Rectangle{

    private double side;

    public Square(){
        side = 0;
        color = "neither";
        filled = false;
    }

    public Square(double inpside){
        side = inpside;
        color = "neither";
        filled = false;
    }

    public Square(double inpside, String inpcolor, boolean inpfilled){
        side = inpside;
        color = inpcolor;
        filled = inpfilled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setLength(double length) {
        super.setLength(side);
    }

    public void setWidth(double width) {
        super.setWidth(side);
    }

    public String toString() {
        return "Квадрат:" + "\n Длина стороны = " + side + "\n Цвет = " + color + "\n Наполнение = " + filled;
    }
}
