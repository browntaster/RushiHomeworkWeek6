package week7MidHomework;

import java.util.Scanner;
/*10. Write a program to print the sum of two numbers entered by user by defining your
own method.*/
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the Second Number: ");
        int num2 = sc.nextInt();

        int sum = num1+num2;

        System.out.println("Sum of two numbers :"+sum);
    }
}
