package mirea.lab1;

public class Ted {
    private int[] numbers = new int[10];
    private int output;

    public Ted() {
        output = 0;
    }

    public void filler() {
        output = 0;
        for (int i = 0; i < 10; i++) {
            numbers[i] = i;
        }
    }

    public void summWhile() {
        output = 0;
        int i = 0;
        while (i < 10) {
            output = output + numbers[i];
            i++;
        }
    }

    public void summFor() {
        output = 0;
        for (int i = 0; i < 10; i++) {
            output = output + numbers[i];
        }
    }

    public void summDoWhile() {
        output = 0;
        int i = 0;
        do {
            output = output + numbers[i];
            i++;
        } while (i < 10);
    }

    public String toString() {
        return "Summ = " + output;
    }
}
