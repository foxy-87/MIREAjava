package mirea.pract10;

public interface CompexAbstractFactory {
    public default Complex createComplex(){
        Complex l = new Complex(0, 0);
        return l;
    }

    public default Complex createComplex(int real, int image){
        Complex l = new Complex(real, image);
        return l;
    }
}
