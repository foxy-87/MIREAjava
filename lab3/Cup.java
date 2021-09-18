package mirea.lab3;

public class Cup extends Dish {
    protected static String TYPE_NAME = "кружк";

    public Cup() {
        super(TYPE_NAME);
    }

    public Cup(String color) {
        super(TYPE_NAME, color);
    }

    public void material(String materialName) {
        System.out.println("Эта " + getColor() + "ая " + getType() + "а сделана из " + materialName);
    }

    public void food(String food) {
        System.out.println("В " + getColor() + "ой " + getType() + "е налит " + food);
    }
}
