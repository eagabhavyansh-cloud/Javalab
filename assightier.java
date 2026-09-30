public class assightier {
    public static String assignTier(char size, double weight) {
        if (size == 's' && weight <= 1.0) return "small"; 
        if (size == 'm' && weight <= 5.0) return "medium";
        return "large";


        }
        static double  computefee(String tier){
            switch(tier) {
                case "small": return 35.0;
                case "medium": return 50.0;
                default: return 20.0;

                   
        }

       
    }
    static void printreciept (String tier, double fee) {
        System.out.println("Tier: " + tier);
        System.out.printf("Fee: $%.2f%n", fee);
       
    }

}