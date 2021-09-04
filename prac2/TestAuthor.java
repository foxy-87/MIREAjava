package mirea.prac2;

public class TestAuthor {
    public static void main(String[] arg) {
        Author author = new Author("Джордж", "G@gmail.com", 'M');
        System.out.println(author);
        author.setEmail("George@gmail.com");
        System.out.println(author);
    }
}
