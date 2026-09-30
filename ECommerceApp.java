class ShoppingCart {
String ownerName;
int itemCount;
double totalPrice;
// 1. Default Constructor: Initializes default guest cart
public ShoppingCart() {
this.ownerName = "Guest User";
this.itemCount = 0;
this.totalPrice = 0.0;
}
public ShoppingCart(String ownerName, int itemCount, double totalPrice){
    this.ownerName = ownerName;
    this.itemCount = itemCount;
    this.totalPrice = totalPrice;

}
public void displayCartDetails() {

    System.out.println("Cart Owner:" + ownerName
        + "| Items:" +itemCount
        + "| Total:$" + totalPrice
    );
}
}
public class ECommerceApp {
    public static void main(String[] args)  {
        ShoppingCart guestCart = new ShoppingCart();
        ShoppingCart userCart = new ShoppingCart("Alice ", 3 , 149.99);
        guestCart.displayCartDetails();
        userCart.displayCartDetails();
        
    }

}




