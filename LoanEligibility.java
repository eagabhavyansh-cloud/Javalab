public class LoanEligibility {
    public static void main(String[] args)
    {
        int age = 25;
        double salary = 45000;

        boolean eligible = age >= 21 && salary >=30000;

        System.out.println("Loan Eligibility:" + eligible);
        
        
    }
    
}
