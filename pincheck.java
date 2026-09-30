import java.util.Scanner;
public class pincheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int correctpin = 1234;
        int enterdpin = 0;

        while(enterdpin != correctpin){
            System.out.println("Enter correct pin:" );
            enterdpin = sc.nextInt();

        }
        System.out.println("Acess granted");



    
    }
    
}
