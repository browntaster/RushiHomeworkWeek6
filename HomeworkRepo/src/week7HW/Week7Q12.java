package week7HW;

import java.util.Scanner;

public class Week7Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet between A to F");
        String city = sc.nextLine();

        switch (city){
            case "A":
                System.out.println("City: Amsterdam");
                break;
            case "B":
                System.out.println("City: Baroda");
                break;
            case "C":
                System.out.println("City: chennai");
                break;
            case "D":
                System.out.println("City: Delhi");
                break;
            case "E":
                System.out.println("City: Edmonton");
                break;
            case "F":
                System.out.println("City: Fuji");
                break;
            default:
                System.out.println("Invalid entry");
        }
    }
}
