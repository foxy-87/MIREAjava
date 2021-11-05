package mirea.pract10;

public class ConcreteFactory implements CompexAbstractFactory {

    public Complex createComplex(){
        Complex l = new Complex(0, 0);
        return l;
    }

    public Complex createComplex(int real, int image){
        Complex l = new Complex(real, image);
        return l;
    }

    public static void main(String[] args) {
        int num = 2;
        int image = 3;
        ConcreteFactory test = new ConcreteFactory();
        System.out.println(test.createComplex(num, image));
        System.out.println(test.createComplex());
    }
}
