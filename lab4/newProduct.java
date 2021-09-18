package mirea.lab4;

public class newProduct implements Priceable {
    protected double price;
    protected String name;

    public newProduct() {
        this.price = 0;
        this.name = "undefined";
    }

    public newProduct(double price, String summary) {
        this.price = price;
        this.name = summary;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
