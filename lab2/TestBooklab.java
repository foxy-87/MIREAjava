package mirea.lab2;

public class TestBooklab {
    public static void main(String[] arg) {
        Booklab Test = new Booklab("451 градус по Фаренгейту", "Рэй Дуглас Брэдбери", 1953);
        System.out.println("Книга " + Test.getName() + " написанна " + Test.getAuthor() + " была выпущена " + Test.getYear());
        Test.setName("Над пропастью во ржи");
        Test.setAuthor("Джером Сэлинджер");
        Test.setYear(1951);
        System.out.println("Книга " + Test.getName() + " написанна " + Test.getAuthor() + " была выпущена " + Test.getYear());
    }
}
