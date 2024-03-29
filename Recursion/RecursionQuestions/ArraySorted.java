// Check if an array is sorted (Strictly Increasing)
package Recursion.RecursionQuestions;

public class ArraySorted {

    public static boolean isSorted(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return true;
        }

        if (arr[idx] < arr[idx + 1]) {
            // array is sorted till now
            return isSorted(arr, idx + 1);
        } else {
            return false;
        }

    }

    // Time Complexity = O(n)

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5 };
        System.out.println(isSorted(arr, 0));

    }
}
