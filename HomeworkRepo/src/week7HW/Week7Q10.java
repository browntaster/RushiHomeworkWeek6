package week7HW;

import java.util.Scanner;

public class Week7Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Sales ID: ");
        int SaleId = sc.nextInt();

        System.out.println("Enter Saller's Name: ");
        sc.nextLine();
        String SallerName = sc.nextLine();

        System.out.println("Enter Sales Amount: ");
        double SalesAmount = sc.nextDouble();

        System.out.println("Enter Salary Basic: ");
        double SalaryBasic = sc.nextDouble();

        double commissionPercentage;

        if (SalesAmount>=50000){
            commissionPercentage = 0.35;
        } else if (SalesAmount>=30000) {
            commissionPercentage = 0.20;
        } else if (SalesAmount>=20000) {
            commissionPercentage = 0.10;
        } else if (SalesAmount>=10000) {
            commissionPercentage = 0.05;
        } else {
            commissionPercentage = 0.02;
        }
double SalesCommission = SalesAmount*commissionPercentage;

        System.out.println("Sales Details");
        System.out.println("Sales Id: " + SaleId);
        System.out.println("Saller's Name: " + SallerName);
        System.out.println("Sales Amount: " +SalesAmount);
        System.out.println("Salary Basic: " + SalaryBasic);
        System.out.println("Comission Percentage: " + (commissionPercentage*100) + "%" );
        System.out.println("Sales Commision: " + SalesCommission);

    }
}
