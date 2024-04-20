package week7HW;

import java.util.Scanner;

public class Week7Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Roll Number: ");
        int number = sc.nextInt();

        System.out.println("Enter Math's marks: ");
        double mathMarks = sc.nextDouble();

        System.out.println("Enter Science's marks: ");
        double scienceMark = sc.nextDouble();

        System.out.println("Enter English's Marks: ");
        double englishMark = sc.nextDouble();

        double totalMarks = mathMarks+scienceMark+englishMark;
        double percentage = totalMarks/3;
        String result = (percentage>=35) ? "Pass" : "Fail";

        String grade;

        if (percentage>=80){
            grade = "A+";
        } else if (percentage>=60) {
            grade = "A";
        } else if (percentage>=50) {
            grade = "B";
        } else if (percentage>=35) {
            grade = "C";
        } else {
            grade = "D";
        }

        System.out.println("__________________________________________________");
        System.out.println("|                  Mark Sheet                    |");
        System.out.println("|________________________________________________|");
        System.out.println("|   Name              : " +name+"                |" );
        System.out.println("|   Roll Number       : " +number+"              |");
        System.out.println("|------------------------------------------------|");
        System.out.println("|   Subject           :  Marks                   |");
        System.out.println("|   Math              : "+mathMarks+"              |");
        System.out.println("|   Science           : "+scienceMark+"            |");
        System.out.println("|   English           : "+englishMark+"            |");
        System.out.println("|________________________________________________|");
        System.out.println("|   Total             : "+totalMarks+"           |");
        System.out.println("|________________________________________________|");
        System.out.println("|   Percentage        : "+percentage+"           |");
        System.out.println("|   Result            : "+result+"               |");
        System.out.println("|   Grade             : "+grade+"                |");
        System.out.println("|________________________________________________|");
    }
}
