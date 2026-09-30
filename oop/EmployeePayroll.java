package oop;

import java.util.Scanner;

public class EmployeePayroll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = sc.next();
        System.out.print("Enter basic salary: ");
        double basic = sc.nextDouble();

        double hra = basic * 0.20;
        double da = basic * 0.10;
        double pf = basic * 0.12;
        double gross = basic + hra + da;
        double net = gross - pf;

        System.out.println("Employee : " + name);
        System.out.println("Basic    : " + basic);
        System.out.println("HRA      : " + hra);
        System.out.println("DA       : " + da);
        System.out.println("PF       : " + pf);
        System.out.println("Gross    : " + gross);
        System.out.println("Net pay  : " + net);
    }
}
