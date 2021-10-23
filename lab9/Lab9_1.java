package mirea.lab9;

public class Lab9_1 {
    public void exceptionDemo(){
        System.out.println(2/0);
    }
    
    public void exceptionDemo2(){
        try{
            System.out.println( 2 / 0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void main(String[] args) {
        Lab9_1 test = new Lab9_1();
        test.exceptionDemo2();
        test.exceptionDemo();
    }
}
