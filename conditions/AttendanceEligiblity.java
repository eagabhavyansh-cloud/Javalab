package conditions;

import java.util.Scanner;
public class AttendanceEligiblity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter attendance Percentage:");
        double attendance = sc.nextDouble();

        if (attendance >= 75)
        {
            System.out.println("Eligible for examination  ");


        } else {
            System.out.println("Not eligible for examination");
            
        }

        

    }

    
}
