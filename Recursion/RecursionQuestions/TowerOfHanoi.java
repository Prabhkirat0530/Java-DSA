// Tower Of Hanoi
package Recursion.RecursionQuestions;

public class TowerOfHanoi {
    public static void towerNumber(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }

        towerNumber(n - 1, src, dest, helper);
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        towerNumber(n - 1, helper, src, dest);
    }

    // Time Complexity = O(2^n)

    public static void main(String[] args) {
        int n = 3;
        towerNumber(n, "S", "H", "D");
    }
}
