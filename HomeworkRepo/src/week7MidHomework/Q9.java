package week7MidHomework;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number Of Classes Held: ");
        int classesHeld = sc.nextInt();

        System.out.println("Enter the Number Of Classes Attend: ");
        int classesAttend = sc.nextInt();

        System.out.println("Do You Have a Medical Cause? (Y/N) ");
        char medicalCause = sc.next().charAt(0);

        double percentage = ((double) classesAttend/classesHeld)*100;

        System.out.println("Percentage Of Classes Attended "+percentage+"%");

        if (medicalCause == 'Y') {
            System.out.println("Allowed to sit in Exam Due to Medical Cause");
        } else if (percentage >= 75) {
            System.out.println("Allowed to sit in Exam");
        } else {
            System.out.println("Not allowed to sit in exam");
        }
    }
}
