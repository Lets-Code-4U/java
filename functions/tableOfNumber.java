package functions;

import java.util.*;

public class tableOfNumber {
    public static void printTable(int n) {
        if (n < 1) {
            System.out.println("Invalid input!");
            return;
        }
        for (int i = 1; i <= 10; i++) {
            int result = n * i;
            System.out.printf("%d * %d = %d \n", n, i, result);
        }
        return;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number to pirnt the table :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printTable(n);
    }
}
