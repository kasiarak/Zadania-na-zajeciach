package PPJ.ppjz_12;

public class Product {
    String name;
    double price;
    ShoppingCart shoppingCart;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public void addToShoppingCart(ShoppingCart shoppingCart){
         shoppingCart.addProduct(this);
         shoppingCart = shoppingCart;
    }
    public void display(){
        System.out.println(name + ", " + price);
    }
}
