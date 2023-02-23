// Find the First and Last occurance of an element in string
package Recursion.RecursionQuestions;

public class FirstAndLastOccurance {

    public static int first = -1;
    public static int last = -1;

    public static void findOccurence(String str, int idx, char element) {
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char currChar = str.charAt(idx);
        if (currChar == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }

        findOccurence(str, idx + 1, element);
    }

    // Time Complexity = O(n)

    public static void main(String[] args) {
        String str = "abaacdaefaah";
        findOccurence(str, 0, 'a');
    }
}
