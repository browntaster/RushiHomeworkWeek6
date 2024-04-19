package week7MidHomework;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Number of classes held: ");
        int classesHeld = sc.nextInt();

        System.out.println("Number of classes attend: ");
        int classesAttend = sc.nextInt();

        double percentage = ((double) classesAttend/classesHeld)*100;
        System.out.println("Percentage of classes attend: "+percentage+"%");

        if (percentage>=75){
            System.out.println("Allowed to sit in exam");
        } else {
            System.out.println("Not allowed to sit in exam");
        }
    }
}
