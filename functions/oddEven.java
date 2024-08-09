package functions;

import java.util.*;

public class oddEven {
    public static void check(int n) {
        if (n % 2 == 0) {
            System.out.println("Even");
            return;
        } else
            System.out.println("Odd");
    }

    public static void main(String[] args) {
        System.out.println("Enter the number to check:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        check(n);
    }
}
