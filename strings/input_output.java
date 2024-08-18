package strings;

import java.util.*;

public class input_output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name : ");
        String firstName = sc.next();
        System.out.println("Enter last name : ");
        String lastName = sc.next();

        // String concatenation (joining two strings)
        String fullName = firstName + " " + lastName;

        System.out.println("Your name is : ");
        System.out.println(fullName);
    }
}
