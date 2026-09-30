package methods;

import java.util.Scanner;
public class Employeeprofile {
    public static void employeeDetails(int id, String name, String department){
        System.out.println("employee ID: " + id);
        System.out.println("employee name: " + name);
        System.out.println("employee department: " + department);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter employee ID: ");
        int id = sc.nextInt();
        
        System.out.println("enter employee name: ");
        String name = sc.next();
        
        System.out.println("enter employee department:");
        String department = sc.next();

        employeeDetails(id, name, department);
        
    }
}
