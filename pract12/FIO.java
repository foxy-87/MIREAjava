package mirea.pract12;

public class FIO {
    private String name, surname, patronymic;

    public FIO(String surname) {
        this.surname = surname;
    }

    public FIO(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public FIO(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }
    public String getFio(){
        StringBuilder sb = new StringBuilder(surname);
        if(name != null && ! name.equals(""))
            sb.append(" ").append(name);
        if(patronymic != null && ! patronymic.equals(""))
            sb.append(" ").append(patronymic);
        return sb.toString();
    }

    public static void main(String[] args) {
        FIO person1 = new FIO("Богданов");
        FIO person2 = new FIO("Ковалева", "Анна");
        FIO person3 = new FIO("Астахова", "Эмилия", "Егоровна");

        System.out.println(person1.getFio());
        System.out.println(person2.getFio());
        System.out.println(person3.getFio());
    }
}
