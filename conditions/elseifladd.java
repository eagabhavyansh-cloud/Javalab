package conditions;

public class elseifladd {
    public static void main(String[] args){
        double capacity = 40;
        if (capacity <= 25){
            System.out.println("low used");
        } else if (capacity <= 30) {
            System.out.println("medium used");
        } else {
            System.out.println("high used");
        }
    }
}
