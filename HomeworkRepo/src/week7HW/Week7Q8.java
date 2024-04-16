package week7HW;

import java.util.Scanner;

public class Week7Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        if (num>0)
        {
            System.out.println("Postive");
        } else
            System.out.println("Negetive");
    }
}
