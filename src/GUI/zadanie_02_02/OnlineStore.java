package GUI.zadanie_02_02;

public class OnlineStore extends ShoppingCart {
    public static void main(String[] args) {
    OnlineStore store = new OnlineStore();

    //TODO: implement Book class
    Product book = new Book("The Catcher in the Rye", 10.99);
    //TODO: implement Clothing class
    Product shirt = new Clothing("Blue Shirt", 25.99);
    //TODO: implement Electronic class
    Product phone = new Electronics("iPhone 12", 999.99);

        store.addProduct(book);
        store.addProduct(shirt);
        store.addProduct(phone);

        System.out.println("Total price: "+store.getTotalPrice());

        store.removeProduct(shirt);

        System.out.println("Total price: "+store.getTotalPrice());
        int x = 10;
}
    private Product[] products = new Product[20];
    private int productCounter = 0;

//TODO: implement missing methods from abstract class
}
