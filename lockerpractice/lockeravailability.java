package lockerpractice;

public class lockeravailability {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Locker " + i + ": Occupied");
            } else {
                System.out.println("Locker " + i + ": Available");
            }
        }
    }
}
