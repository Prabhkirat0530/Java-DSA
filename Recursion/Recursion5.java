// print x^n (stack height = n)
// x^n means multiplying x with x, n times
package Recursion;

public class Recursion5 {
    public static int calcPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }

        int xPowernm1 = calcPower(x, n - 1);
        int xPown = x * xPowernm1;
        return xPown;
    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = calcPower(x, n);
        System.out.println(ans);
    }
}
