package mirea.prac1;

public class Book {
    private int year;
    private String name;

    public Book(int inpyear, String inpname) {
        year = inpyear;
        name = inpname;
    }

    public Book(int inpyear) {
        year = inpyear;
        name = "HELP!!! I DON'T HAVE A NAME";
    }

    public Book() {
        year = 0;
        name = "HELP!!! I DON'T HAVE A NAME";
    }

    public void setname(String inpname) {
        name = inpname;
    }

    public void setyear(int inpyear) {
        this.year = inpyear;
    }

    public int getyear() {
        return year;
    }

    public String getname() {
        return name;
    }

    public String toString() {
        return "This book is called " + this.name + ", it was written in " + this.year;
    }
}
