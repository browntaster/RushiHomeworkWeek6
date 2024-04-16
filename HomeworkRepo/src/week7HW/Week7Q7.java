package week7HW;

import java.util.Scanner;

public class Week7Q7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(" Enter a number");
        int num = scn.nextInt();

        if (num>0)
        {
            if (num%2==0)
            {
                System.out.println("Even");
            }
            else
                System.out.println("Odd");
            scn.close();
        }
    }
}
