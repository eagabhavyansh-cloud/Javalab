package basics;

import java.util.Scanner;
public class ProductCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the product name: ");
        String productName = sc.nextLine();
        System.out.print("Enter the product price: ");
        double productPrice = sc.nextDouble();
        System.out.print("Enter the product quantity: ");
        int productQuantity = sc.nextInt();
        double totalCost = productPrice * productQuantity;
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + productPrice);
        System.out.println("Product Quantity: " + productQuantity);
        System.out.println("Total Cost: " + totalCost); 
        

    }
    
}
