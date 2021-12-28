public class SmallestLetterGreaterThanTarget {

    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'g';
        char ans = nextGreatestLetter(letters , target);
        System.out.println(ans);
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid_index = start + (end - start) / 2;

            if (target < letters[mid_index]) {
                end = mid_index - 1;
            } else {
                start = mid_index + 1;
            }
        }
        return letters[start % letters.length];
    }
}
