package mirea.pract6;

public class pract6 {
    public static void main(String a[])
    {
        int[] iDNumber  = {5, 31, 6, 15, 25, 27, 8, 19, 28, 2, 23, 3, 9, 7, 30, 21, 11, 13, 10, 22, 14, 16, 4, 24, 26, 18, 32, 20, 29, 12, 17, 1};
        int[] Student = new int[32];
        System.out.print("Содержимое в массиве iDNumber: ");
        for(int i = 0; i < iDNumber.length; i++){
            System.out.print(iDNumber[i] + " ");
        }
        System.out.println("\nСортировка...");
        insertionSort(iDNumber);
        Student = iDNumber;
        System.out.print("Содержимое в массиве Student: ");
        for(int i = 0; i < Student.length; i++){
            System.out.print(Student[i] + " ");
        }
    }
    public static void insertionSort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; i++){
            int key = arr[i];
            int j = i-1;
            while ( (j > -1) && ( arr [j] > key ) )
            {
                arr [j+1] = arr [j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}