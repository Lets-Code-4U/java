package functions;

import java.util.*;

public class multiply {
    public static void mult(int a, int b) {
        int result = a * b;
        System.out.println(result);
        return;
    }

    public static void main(String[] args) {
        System.out.println("Enter the two numbers to multiply:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        mult(a, b);
    }
}
