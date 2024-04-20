package week7MidHomework;

import java.util.Scanner;
/*11. Write a program to print a string entered by user.*/
public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String addString = sc.nextLine();

        System.out.println("You Entered: "+addString);
    }
}
