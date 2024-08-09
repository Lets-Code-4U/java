/* Enter the number of rows : 
5
*****
*****
*****
*****
***** */

import java.util.*;

public class pt01 {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.print("\n");

        }
    }
}
