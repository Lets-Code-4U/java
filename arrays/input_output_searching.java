
// take an array from the user.Search for a fiven number and print the index at which i occurs.If not found then generate an output.

package arrays;

import java.util.*;

public class input_output_searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search : ");
        int x = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if (numbers[i] == x) {
                System.out.println("Your element is at an index : " + i);
                break;
            } else if (numbers[i] != x) {
                System.out.println("Element not found! ");
                break;
            }

        }
    }
}
