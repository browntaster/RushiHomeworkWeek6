package week7MidHomework;

import java.util.Scanner;
/*Take values of length and breadth of a rectangle from user and check if it is square or not.*/
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of Rectangle");
        double length = sc.nextDouble();

        System.out.println("Enter the breadth of Rectangle");
        double breadth = sc.nextDouble();

        if (length == breadth){
            System.out.println("It's rectangle");
        } else {
            System.out.println("Its not rectangle");
        }


    }
}
