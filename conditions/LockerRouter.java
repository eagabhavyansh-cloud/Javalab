package conditions;

import java.util.Scanner;
public class LockerRouter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter longest side (cm) and weight (kg):");
        int longside = sc.nextInt();
        double weight = sc.nextDouble();
        char tier;
        if (longside <= 20 && weight <= 0.2) tier = 'S';
        else if (longside <= 40 && weight <= 5.0) tier = 'M';
        else if (longside <= 60 && weight <= 20.0) tier = 'L';
        else tier = 'X';
        String zone;
        String note;
        switch (tier){
            case 'S':
                zone = "Zone A";
                note = "cubbyshelf";
                break;
            case 'M':
                zone = "zone B";
                note = "Standard lockers";
                break;
            case 'L':
                zone = "zone C";
                note = "Tall locker";
                break;
            default:
                zone = "Counter";
                note = "manual handeling";
                break;
        }
        System.out.printf("Tier %c -> %s (%s)%n", tier, zone, note);
    }
}
