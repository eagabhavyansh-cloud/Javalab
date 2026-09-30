import java.util.Scanner;
public class Admissioneligibility {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Enterance Score:");
        int score = sc.nextInt();

        if ( score >= 60 )  {
            System.out.println("Student is eligible for admission.");
            
        }
    }

    
}
