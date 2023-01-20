import java.util.*;

public class StringBuild {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        // set char at index
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        // inserting a char at index
        sb.insert(2, 'n');
        System.out.println(sb);

        // delete the char at index
        sb.delete(2, 3);
        System.out.println(sb);

        sb.append("e");
        System.out.println(sb);
    }
}