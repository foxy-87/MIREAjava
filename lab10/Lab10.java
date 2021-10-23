package mirea.lab10;

import java.util.ArrayList;

public class Lab10 {
    public static <E> ArrayList<E> arrayToList(E[] array){
        if(array == null)
            throw new IllegalArgumentException("Null array!");
        ArrayList<E> list = new ArrayList<>(array.length);
        for (E element : array) {
            list.add(element);
        }
        return list;
    }
    public static void main(String[] args) {
        String[] line = new String[]{"Hello", "world", "!"};
        ArrayList<String> list = arrayToList(line);
        System.out.println(line[0] + " " + line[1] + " " + line[2]);
        System.out.println(list);
    }
}
