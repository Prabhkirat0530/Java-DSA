// Move all 'x' to the end of the string
package Recursion.RecursionQuestions;

public class MoveAllxToEnd {

    public static void moveAllX(String str, int idx, int count, String newString) {

        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if (currChar == 'x') {
            count++;
            moveAllX(str, idx + 1, count, newString);
        } else {
            newString += currChar; // current char added to new string
            moveAllX(str, idx + 1, count, newString);
        }

    }

    // Time Complexity = O(n)

    public static void main(String[] args) {
        String str = "axbcxxd";
        moveAllX(str, 0, 0, "");
    }
}
