package Algorithms;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 4, 1, 2 };
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // insertion sort
    static void InsertionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            // placment
            arr[j + 1] = current;
        }
    }

}
