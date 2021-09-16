package mirea.pract3;

public class Test {
    public static void main(String[] arg){
        Circle circle = new Circle(5, "green", true);
        Rectangle rectangle = new Rectangle(10, 15, "orange", true);
        Square square = new Square(40);
        circle.setRadius(3);
        rectangle.setLength(10);
        rectangle.setWidth(15);
        square.setSide(7);
        System.out.println(circle + "\n При таких параметрах длина окружности " + circle.getPerimeter() + " а площадь " + circle.setArea());
        System.out.println(rectangle + "\n При таких параметрах периметр " + rectangle.getPerimeter() + " а площадь " + rectangle.setArea());
        System.out.print(square);
    }
}