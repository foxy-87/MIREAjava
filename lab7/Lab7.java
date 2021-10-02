package mirea.lab7;

import java.util.ArrayList;

public class Lab7{

    public static void main(String[] args) {

        ArrayList<String> game = new ArrayList<String>();
        game.add("Dark Souls");
        game.add("Doom");
        game.add("Civilization 5");
        game.add(3, "Half life alyx");

        System.out.println("В ячейке номер 2 находится:" + game.get(2));

        game.set(2, "Dishonored");

        System.out.println("А теперь:" + game.get(2));

        System.out.println("Сейчас в списке " + game.size() + " игр и вот они:");

        for(String person : game){
            System.out.println(person);
        }

        if(game.contains("Dishonored")){
            System.out.println("В списке есть:" + game.get(2));
        }

        game.remove("Dishonored");

        game.remove(1);

        System.out.println("Мы удалили несколько значений и теперь остались только:");

        Object[] gameArray = game.toArray();
        for(Object person : gameArray){
            System.out.println(person);
        }

    }
}