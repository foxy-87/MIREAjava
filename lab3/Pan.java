package mirea.lab3;

public class Pan extends Dish {
    protected static String TYPE_NAME = "сковородк";

    public Pan() {
        super(TYPE_NAME);
    }

    public Pan(String color) {
        super(TYPE_NAME, color);
    }

    public void material(String materialName) {
        System.out.println("Эта " + getColor() + "ая " + getType() + "а сделана из " + materialName);
    }

    public void food(String food) {
        System.out.println("В " + getColor() + "ой " + getType() + "е жарится " + food);
    }
}
