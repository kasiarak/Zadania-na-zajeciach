package zadanie_02_02;

public abstract class ShoppingCart {
    double totalprice = 0;
    Product addProduct(Product product){
        totalprice += product.price;
        return product;
    }
    Product removeProduct(Product product){
        totalprice -= product.price;
        return product;
    }
    double getTotalPrice(){
        return totalprice;
    }

}
