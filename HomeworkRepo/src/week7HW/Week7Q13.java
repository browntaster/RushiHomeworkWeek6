package week7HW;

import java.util.Scanner;

public class Week7Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Enter the symbol: ");
        char symbol = sc.next().charAt(0);

        double result;

        if (symbol == '+'){
            result = num1+num2;
            System.out.println("Result: " + result);
        } else if (symbol == '-') {
            result = num1-num2;
            System.out.println("Result: " + result);
        } else if (symbol == '/') {
            result = num1/num2;
            System.out.println("Result: " + result);
        } else if (symbol == '*') {
            result = num1*num2;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Invalid symbol entered");
        }


    }
}
