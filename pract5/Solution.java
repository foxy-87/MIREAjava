package mirea.pract5;

import java.util.Scanner;

public class Solution {
    public static Scanner scanner = new Scanner(System.in);
    public static void recursion(int first, int mean) {
        if (first > mean){
            return;
        }
        if(first == mean){
            System.out.print(first);
        }
        else{
            System.out.println(first);
        }
        recursion(first + 1, mean);
    }

    public static void main(String[] args) {
        System.out.print("Введите число до которого надо досчитать: ");
        int n = scanner.nextInt();
        recursion(1, n);
    }
}
