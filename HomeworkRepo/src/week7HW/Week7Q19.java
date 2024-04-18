package week7HW;

import java.util.Scanner;

public class Week7Q19 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();

        if (num >= 1){
            System.out.println("Enter number is Postive");
        } else if (num <= -1) {
            System.out.println("Enter number is Negative");
        } else {
            System.out.println("Enter number is Zero");
        }
    }
}
