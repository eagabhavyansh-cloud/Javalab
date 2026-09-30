package conditions;

import java.util.Scanner;
public class ParcelIntake {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter parcel id, reciepient, size (S/M/L) and weight:");
        String id = sc.next();
        String reciepient = sc.next();
        char size = sc.next().charAt(0);
        double weight = sc.nextDouble();

        int base = ( size == 'L' ) ? 30 : ( size == 'M' ) ? 20 : 10;
        int surcharge = (int) Math.ceil(weight) * 2;
        int fee = base + surcharge;

        System.out.printf("Parcel: %s (%s)%n", id, reciepient);
        System.out.printf("Size: %c Weight: %.1fkg%n", size, weight);
        System.out.printf("Fee: Rs %d%n", fee);
    }
}
