package mirea.lab8;

import java.io.*;

public class lab8 {
    public static void main(String[] args) throws FileNotFoundException {
        File read = new File("over.txt");
        BufferedReader in = new BufferedReader(new FileReader(read));
        System.out.println("Сейчас в файле написано:" + in);
    }
}
