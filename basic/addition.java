import java.util.*;

public class addition {
    public static void main(String[] args) {
        System.out.println("This program is to add two numbers.\nEnter two numbers:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum=(a+b);
        System.out.println("The sum of two numbers is :");
        System.out.print(sum);

    }
}
