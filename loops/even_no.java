// This program is to print even numbers between n natural numbers

import java.util.*;

public class even_no {
    public static void main(String[] args) {
        System.out.println("Enter the value of n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("The list of even numbers between 1 and %d is : ",n);
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i+" ");
            }
        }
    }
}
