package functions;
import java.util.*;
public class factorial {
    public static void printFactorial(int n) {
        if (n < 0) {
            System.out.println("Invalid input!");
        }
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number to get the factorial.");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        printFactorial(n);
    }
}
