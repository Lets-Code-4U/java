import java.util.*;

public class calculator {

    public static void main(String[] args) {
        System.out.println("Simple Calculator :");
        System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.Modulo");

        Scanner sc = new Scanner(System.in);
        System.out.println("What would you like to perform!");
        int operation = sc.nextInt();
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();

        int sum = a + b, mult = a * b, div = a / b, subs = a - b, mod = a % b;

        switch (operation) {
            case 1:
                System.out.printf("You chose Addition!\nSo, your answer is : %d", sum);
                break;
            case 2:
                System.out.printf("You chose Substraction!\nSo, your answer is : %d", subs);
                break;
            case 3:
                System.out.printf("You chose Multiplication!\nSo, your answer is : %d", mult);
                break;
            case 4:
                System.out.printf("You chose Division!\nSo, your answer is : %d", div);
                break;
            case 5:
                System.out.printf("You chose Modulo!\nSo, your answer is : %d", mod);
                break;
            default:
                System.out.println("Invalid Entry! Try once more");
        }
    }
}