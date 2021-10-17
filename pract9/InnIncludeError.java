package mirea.pract9;

public class InnIncludeError extends Exception {

    public InnIncludeError(int INN){
        super("Введённый ИНН " + INN + " не действителен");
    }
}