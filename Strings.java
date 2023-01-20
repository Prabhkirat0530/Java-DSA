import java.util.*;

public class Strings {
    public static void main(String[] args) {
        // String decleration
        String name = "Tony";
        String fullName = "Tony Stark";
        String sentence = "My name is Tony Stark.";

        // User input
        Scanner sc = new Scanner(System.in);
        String name2 = sc.next();
        System.out.println("Your name is: " + name2);

        // Concatination (jordna or 2 strings ko add karna)
        String firstName = "tony";
        String lastName = "stark";
        String fullName2 = firstName + " " + lastName;
        System.out.print(fullName2);
        System.out.println(fullName2.length());

        // charAt
        for (int i = 0; i < fullName2.length(); i++) {
            System.out.print(fullName2.charAt(i));
        }

        // Comparing Strings
        String namea = "Tony";
        String nameb = "Tony";

        // 1 s1>s2 : +ve value
        // 2 s1==s2 : 0
        // 3 s1<s2 : -ve value

        if (namea.compareTo(nameb) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

    }
}
