package mirea.prac2;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String inpname, String inpemail, char inpgender) {
        name = inpname;
        email = inpemail;
        gender = inpgender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email1) {
        email = email1;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return "My name: " + this.name + ". My email: " + this.email + ". My gender: " + gender;
    }
}
