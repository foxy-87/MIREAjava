package mirea.lab12;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab12 {

    public static ArrayList<String> findRubEurUsd(String s){
        Pattern preset  = Pattern.compile("\\d+(\\.\\d+)?\\s?((USD)|(EUR)|(RUB))");
        Matcher moneyPreset = preset.matcher(s);
        ArrayList<String> money = new ArrayList<>();
        while (moneyPreset.find()){
            money.add(moneyPreset.group());
        }
        return money;
    }

    public static void main(String[] args) {
        System.out.println(findRubEurUsd("12.3 RUB, fejhge12 EUdsfrg3.789USD"));
        System.out.println();
    }
}
