package strings;

import java.util.*;

public class comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string : ");
        String string1 = sc.next();

        System.out.println("Enter string to compare with : ");
        String string2 = sc.next();

        int comparison = string1.compareTo(string2);  // .compareTo() function is used to compare two strings.

        if (comparison == 0) {
            System.out.println("Strings are equal.");
        } else if (comparison > 1) {
            System.out.println("String 1 is greater.");
        } else
            System.out.println("String 2 is greater.");
    }
}
