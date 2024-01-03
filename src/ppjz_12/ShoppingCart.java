package ppjz_12;

public class ShoppingCart {
    String customerName;
    Product[] products = new Product[20];
    int productCount = 0;
    public ShoppingCart(String customerName){
        this.customerName = customerName;
    }
    public void addProduct(Product product){
        if(productCount< products.length) products[productCount++] = product;
    }
    public void displayProduct(){
        for(int i = 0; i < productCount; i++){
           products[i].display();
        }
    }

    public static void main(String[] args) {
        Product product = new Product("product1", 90);
        ShoppingCart shoppingCart = new ShoppingCart("CustomerName");
        shoppingCart.addProduct(product);
        shoppingCart.displayProduct();
    }
}
