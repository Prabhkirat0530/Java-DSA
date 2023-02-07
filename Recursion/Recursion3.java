//print factorial of a number n
package Recursion;

public class Recursion3 {

    public static int printFactorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        int fact1 = printFactorial(n - 1);
        int fact2 = n * fact1;
        return fact2;
    }

    public static void main(String[] args) {
        int n = 5;
        int ans = printFactorial(n);
        System.out.println(ans);
    }
}
