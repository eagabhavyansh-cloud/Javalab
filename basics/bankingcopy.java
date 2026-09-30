package basics;

public class bankingcopy {
    public static void main(String[] args)
    {
        int cusid = 123456789;
        int age = 26;
        float bal =-345f;
        String typesc ="Savings";
         
        boolean status = bal >= 0;

        System.out.println("Customer ID      :" + cusid);
        System.out.println("Age              :" + age);
        System.out.println("Acccont bal      :" + bal);
        System.out.println("Account type     :" + typesc);
        System.out.println("Status           :" + status);


    }
    
}
