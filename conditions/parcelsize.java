package conditions;

import java.util.Scanner;
public class parcelsize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter parcel weight in kg: ");
        int weight = sc.nextInt();
        if (weight <= 1) {
            System.out.println("Small parcel");
        } else if (weight <= 5) {
            System.out.println("Medium parcel");
        } else {
            System.out.println("Large parcel");
        }
    }
}
