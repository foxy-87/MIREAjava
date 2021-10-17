package mirea.pract9;

import java.util.HashMap;
import java.util.Scanner;

public class Shop {

    static public void main(String[] args) throws InnIncludeError {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите ФИО: ");
        String FIO = sc.nextLine();
        System.out.print("Введите ИНН: ");
        int INN = sc.nextInt();

        try {
            checkInn(FIO, INN);
            System.out.println("Всё отлично, ваш заказ оформлен");
        } catch (InnIncludeError e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    public static boolean checkInn(String FIO, int INN) throws InnIncludeError {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Кулагин Платон Викторович", 7486);
        map.put("Чернов Соломон Геласьевич", 2883);
        map.put("Мышкина Вероника Феликсовна", 1375);
        if (map.get(FIO) != INN) {
            throw new InnIncludeError(INN);
        }
        return true;
    }
}