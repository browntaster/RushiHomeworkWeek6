package week7HW;

import java.util.Scanner;

public class Week7Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Alphabet between A to F");
        String city = sc.nextLine();

        if (city.equals("A")){
            System.out.println("City: Amsterdam");
        } else if (city.equals("B")) {
            System.out.println("City: Baroda");
        } else if (city.equals("C")) {
            System.out.println("city: Chennai");
        } else if (city.equals("D")) {
            System.out.println("city: Delhi");
        } else if (city.equals("E")) {
            System.out.println("city: Edmonton");
        } else if (city.equals("F")) {
            System.out.println("city: Fuji");
        } else
            System.out.println("Invalid Entry");
    }
}
