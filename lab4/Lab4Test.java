package mirea.lab4;

public class Lab4Test {
    public static void main(String[] args) {
        Product product = new Product(350, 9000, "Arduino nano");
        System.out.println("Покупайте " + product.getName() + " в нашем магазине всего за " + product.getPrice() + " тугриков!!!");

        newProduct newproduct = new newProduct(32000, "3D принтер");
        System.out.println("Новый товар в нашем магазине " + newproduct.getName() + ", вы можете его купить за " + newproduct.getPrice() + " тугриков!!!");
    }
}
