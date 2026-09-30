public class ShoppingDiscount {
    public static void main(String[] args)
    {
        double amount = 6500;
        double discount = amount >= 5000 ? amount * 0.20 : 0;
        double finalamount = amount - discount;

        System.out.println("Bill amount   :" + amount);
        System.err.println("Discount      :" + discount);
        System.out.println("Final amount  :" + finalamount);

    }

    
}
