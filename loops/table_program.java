// This program will print the table of a number taken from user

import java.util.*;

public class table_program {
    public static void main(String[] args) {
        System.out.println("Enter the number to print the table of: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The table is : ");
        int mult = 1;
        for (int i = 1; i <= 10; i++) {
            mult = n * i;
            System.out.printf("%d * %d = %d\n", n, i, mult);
        }
    }
}
