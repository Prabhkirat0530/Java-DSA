package Practice;

public class Recursion1 {

    public static void printNumbers(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);

        // Function calling itself
        printNumbers(n - 1);
    }

    public static void main(String args[]) {
        int n = 5;

        printNumbers(n);
    }
}