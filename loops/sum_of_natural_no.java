import java.util.*;

public class sum_of_natural_no {
    public static void main(String[] args) {
        System.out.println("Program to print the sum of n natural numbers: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.printf("The sum of %d natural numbers is : %d", n, sum);
    }

}
