package week7MidHomework;
/*Modify the above question to allow student to sit if he/she has medical cause. Ask
        user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.*/
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
