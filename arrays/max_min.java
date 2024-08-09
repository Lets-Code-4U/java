package arrays;

import java.util.*;

public class max_min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        // taking user input as an array
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The largest value in the array is : " + max);
        System.out.println("The smallest value in the array is " + min);
    }
}
