package week7HW;

import java.util.Scanner;

public class Week7Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Id: ");
        int id = sc.nextInt();

        System.out.println("Enter Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Basic Salary: ");
        int basicSalary = sc.nextInt();

        double HRA = 0.1 * basicSalary;
        double DA = 0.08 * basicSalary;
        double TA = 0.09 * basicSalary;
        double PF = 0.2 * basicSalary;

        double grossSalary = basicSalary+HRA+DA+TA+PF;

        System.out.println("|           Salary Slip             |");
        System.out.println("|                                   |");
        System.out.println("| Employee Id     : "+id+"          |");
        System.out.println("| Employee Name   : "+name+"        |");
        System.out.println("|___________________________________|");
        System.out.println("|                                   |");
        System.out.println("| Basic Salary     : "+basicSalary+"|");
        System.out.println("| HRA 10%          : "+HRA+"        |");
        System.out.println("| TA 8%            : "+TA+"           |");
        System.out.println("| DA 9%            : "+DA+"           |");
        System.out.println("| PF 20%           : "+PF+"           |");
        System.out.println("|___________________________________|");
        System.out.println("|                                   |");
        System.out.println("| Gross Salary     : "+grossSalary+"|");
        System.out.println("|===================================|");
    }
}
