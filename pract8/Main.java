package mirea.pract8;

public class Main {
    public static void main(String[] args) {
        UnfairWaitList test1 = new UnfairWaitList();
        BoundedWaitList test2 = new BoundedWaitList(4);

        test1.add("lol");
        test1.add("kek");
        test1.add("cheburek");
        test1.add("NO");

        System.out.println("Вот содержимое в списке test1" + test1);
        test1.remove(3);
        System.out.println("Вот содержимое в списке test1 после удаления " + test1);
        test1.moveToBack(0);
        System.out.println("Вот содержимое в списке test1 после переноса " + test1);

        test2.add("lol");
        test2.add("kek");
        test2.add("cheburek");
        test2.add("NO");

        System.out.println("В списке test2 " + test2.getCapacity() + " и вот содержимое " + test2);
    }
}
