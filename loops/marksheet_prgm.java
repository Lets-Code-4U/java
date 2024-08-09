/* Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
If they enter 0 then stop.
If he/ she scores :
Marks >=90 -> print “This is Good”
89 >= Marks >= 60 -> print “This is also Good”
59 >= Marks >= 0 -> print “This is Good as well”
	Because marks don’t matter but our effort does. */

import java.util.*;

public class marksheet_prgm {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter you choice : (either 0 or 1) ");
        int n = sc.nextInt();

        if(n==1){
            System.out.println("Enter you marks:");
            int marks=sc.nextInt();
            if (marks>=90) {
                System.out.printf("%s your marks is good.",name);
            }
            else if(marks>=60){
                System.out.printf("%s your marks is good as well.",name);
            }
        }
    }
}
