package mirea.prac1;

public class TestBook {
    public static void main(String[] args) {
        Book book1 = new Book(1948, "1984");
        Book book2 = new Book(1985);
        book2.setname("Surly You're Joking, Mr. Feynman");
        System.out.println(book1);
        System.out.println(book2);
    }
}
