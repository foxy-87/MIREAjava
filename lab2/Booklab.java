package mirea.lab2;

public class Booklab {
    private String name;
    private String author;
    private int year;

    public Booklab(String inpname, String inpauthor, int inpyear) {
        name = inpname;
        author = inpauthor;
        year = inpyear;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }
}
